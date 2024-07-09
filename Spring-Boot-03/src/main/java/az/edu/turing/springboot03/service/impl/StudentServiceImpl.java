package az.edu.turing.springboot03.service.impl;

import az.edu.turing.springboot03.domain.entity.Student;
import az.edu.turing.springboot03.domain.repository.StudentRepository;
import az.edu.turing.springboot03.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student with id " + id + " does not exist"));
    }

    @Override
    public void deleteById(Long id) {
        boolean exist = studentRepository.findById(id).isPresent();
        if (!exist) {
            throw new IllegalArgumentException("Student with id " + id + " does not exist");
        }
        studentRepository.deleteById(id);
    }
}

