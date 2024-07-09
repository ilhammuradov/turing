package az.edu.turing.springboot03.controller;

import az.edu.turing.springboot03.domain.entity.Student;
import az.edu.turing.springboot03.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        log.info("GET -> api/v1/students");
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        log.info("GET -> api/v1/students/{}", id);
        try {
            Student student = studentService.findById(id);
            return ResponseEntity.ok(student);
        } catch (IllegalArgumentException e) {
            log.error("No student with id {}: {}", id, e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @PostMapping
    public Student create(@RequestBody Student student) {
        log.info("POST -> api/v1/students");
        return studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> cancelStudent(@PathVariable Long id) {
        log.info("DELETE -> api/v1/students/{}", id);
        try {
            studentService.deleteById(id);
            return ResponseEntity.ok("Student with id " + id + " has been deleted.");
        } catch (IllegalArgumentException e) {
            log.error("Error deleting student with id {}: {}", id, e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

