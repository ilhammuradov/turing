package az.edu.turing.springboot03.service;

import az.edu.turing.springboot03.domain.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student save(Student student);

    List<Student> findAll();

    Student findById(Long id);

    void deleteById(Long id);
}
