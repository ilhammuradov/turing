package az.edu.turing.springboot03.service;

import az.edu.turing.springboot03.domain.entity.Student;
import az.edu.turing.springboot03.model.StudentRequest;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student create(StudentRequest studentRequest);

    Student update(Long id,StudentRequest studentRequest);

    List<Student> getAll();

    Optional<Student> getById(Long id);

    boolean existsById(Long id);

    long count();

    void deleteById(Long id);
}
