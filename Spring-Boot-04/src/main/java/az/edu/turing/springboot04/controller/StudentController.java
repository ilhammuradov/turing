package az.edu.turing.springboot04.controller;

import az.edu.turing.springboot04.service.StudentService;
import az.edu.turing.springboot04.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController {

    private  StudentService studentService;

    @Value("${file.upload-dir}")
    private String uploadDir;

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("name") String name,
                             @RequestParam("age") int age,
                             @RequestParam("image") MultipartFile image) {
        if (image.isEmpty()) {
            return "select a file to upload.";
        }

        try {
            File dir = new File(uploadDir);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            String filename = UUID.randomUUID().toString() + "_" + image.getOriginalFilename();
            Path path = Paths.get(uploadDir + File.separator + filename);

            try (FileOutputStream fos = new FileOutputStream(path.toFile())) {
                fos.write(image.getBytes());
            }

            Student student = new Student(null, name, age, filename);

            studentService.save(student);

            return "File uploaded successfully: " + filename;
        } catch (IOException | SQLException e) {
            e.printStackTrace();
            return "Failed to upload file.";
        }
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable UUID id) {
        try {
            return studentService.findById(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping
    public List<Student> getAllStudents() {
        try {
            return studentService.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable UUID id,
                                @RequestParam("name") String name,
                                @RequestParam("age") int age,
                                @RequestParam("image") MultipartFile image) {
        try {
            String filename = null;
            if (image != null && !image.isEmpty()) {
                filename = UUID.randomUUID().toString() + "_" + image.getOriginalFilename();
                Path path = Paths.get(uploadDir + File.separator + filename);

                try (FileOutputStream fos = new FileOutputStream(path.toFile())) {
                    fos.write(image.getBytes());
                }
            }

            Student existingStudent = studentService.findById(id);
            if (existingStudent == null) {
                return "Student not found.";
            }

            existingStudent.setName(name);
            existingStudent.setAge(age);
            if (filename != null) {
                existingStudent.setImage(filename);
            }

            studentService.update(existingStudent);

            return "Student updated successfully.";
        } catch (IOException | SQLException e) {
            e.printStackTrace();
            return "Error updating student.";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable UUID id) {
        try {
            studentService.deleteById(id);
            return "Student deleted successfully.";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error deleting student.";
        }
    }

    @GetMapping("/images/{filename}")
    public ResponseEntity<Resource> getImage(@PathVariable String filename) {
        try {
            Path file = Paths.get(uploadDir).resolve(filename).normalize();
            Resource resource = new UrlResource(file.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                        .body(resource);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}