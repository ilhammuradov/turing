package az.edu.turing.springboot03.controller;

import az.edu.turing.springboot03.domain.entity.Student;
import az.edu.turing.springboot03.model.StudentRequest;
import az.edu.turing.springboot03.model.StudentView;
import az.edu.turing.springboot03.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<StudentView> getAll() {
        List<Student> students = studentService.getAll();
        return students.stream()
                .map(student -> new StudentView(
                        student.getId(),
                        student.getName(),
                        student.getAge(),
                        student.getGrade()
                ))
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentView> getById(@PathVariable Long id) {
        Optional<Student> studentOpt = studentService.getById(id);
        if (studentOpt.isPresent()) {
            Student student = studentOpt.get();
            StudentView studentView = new StudentView(
                    student.getId(),
                    student.getName(),
                    student.getAge(),
                    student.getGrade()
            );
            return ResponseEntity.ok(studentView);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public StudentView create(@RequestBody StudentRequest studentRequest) {
        Student student = studentService.create(studentRequest);
        return new StudentView(
                student.getId(),
                student.getName(),
                student.getAge(),
                student.getGrade()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentView> update(@PathVariable Long id, @RequestBody StudentRequest studentRequest) {
        try {
            Student student = studentService.update(id, studentRequest);
            StudentView studentView = new StudentView(
                    student.getId(),
                    student.getName(),
                    student.getAge(),
                    student.getGrade()
            );
            return ResponseEntity.ok(studentView);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/count")
    public ResponseEntity<Long> numberOfStudents() {
        return ResponseEntity.ok(studentService.count());
    }

    @GetMapping("/exist/{id}")
    public ResponseEntity<Boolean> isStudentExist(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.existsById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        studentService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
