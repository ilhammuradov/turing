package az.edu.turing.springboot04.service;

import az.edu.turing.springboot04.entity.Student;
import az.edu.turing.springboot04.repository.StudentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentService {
    StudentRepository studentRepository;

    public int save(Student student) throws SQLException {
        return studentRepository.save(student);
    }

    public Student findById(UUID id) throws SQLException {
        return studentRepository.findById(id);
    }

    public List<Student> findAll() throws SQLException {
        return studentRepository.findAll();
    }

    public int update(Student student) throws SQLException {
        return studentRepository.update(student);
    }

    public int deleteById(UUID id) throws SQLException {
        return studentRepository.deleteById(id);
    }
}

