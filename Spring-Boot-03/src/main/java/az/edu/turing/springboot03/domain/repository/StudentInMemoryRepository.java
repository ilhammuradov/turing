package az.edu.turing.springboot03.domain.repository;

import az.edu.turing.springboot03.domain.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentInMemoryRepository implements StudentRepository {

    private static List<Student> STUDENTS;

    @PostConstruct
    public void init() {
        STUDENTS = new ArrayList<>(List.of(new Student(1L, "Ilham", 19, LocalDate.now(), LocalDate.now()), new Student(2L, "Mamed", 21, LocalDate.now(), LocalDate.now()), new Student(3L, "Qulu", 18, LocalDate.now(), LocalDate.now())));
    }

    @Override
    public Student save(Student student) {
        Long id = student.getId();
        Optional<Student> optionalStudent = findById(id);
        if (optionalStudent.isEmpty()) {
            STUDENTS.add(student);
            return student;
        } else {
            optionalStudent.ifPresent(student1 -> {
                student1.setName(student.getName());
                student1.setAge(student.getAge());
                student1.setUpdateDate(student.getUpdateDate());
            });
            return optionalStudent.get();
        }
    }

    @Override
    public List<Student> findAll() {
        return STUDENTS;
    }

    @Override
    public Optional<Student> findById(Long id) {
        return STUDENTS.stream().filter(student -> student.getId().equals(id)).findFirst();
    }

    @Override
    public void deleteById(Long id) {
        STUDENTS.removeIf(student -> student.getId().equals(id));
    }
}
