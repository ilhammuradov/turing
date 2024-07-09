package az.edu.turing.springboot03.domain.repository;

import az.edu.turing.springboot03.domain.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    Student save(Student student);

    List<Student> findAll();

    Optional<Student> findById(Long id);

    void deleteById(Long id);
}
