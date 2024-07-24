package az.edu.turing.springboot03.service.impl;

import az.edu.turing.springboot03.domain.entity.Student;
import az.edu.turing.springboot03.domain.repository.StudentRepository;
import az.edu.turing.springboot03.exception.StudentNotFoundException;
import az.edu.turing.springboot03.model.StudentRequest;
import az.edu.turing.springboot03.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getById(Long id) {
        if(studentRepository.existsById(id)){
            return studentRepository.findById(id);
        }else {
            throw new StudentNotFoundException("Student with id " + id + " not found");
        }
    }

    @Override
    public Student create(StudentRequest studentRequest) {
        Student student = Student.builder()
                .name(studentRequest.name())
                .age(studentRequest.age())
                .grade(studentRequest.grade())
                .build();
        return studentRepository.save(student);
    }

    @Override
    public Student update(Long id, StudentRequest studentRequest) {
        Optional<Student> existingStudentOpt = studentRepository.findById(id);
        if (existingStudentOpt.isPresent()) {
            Student existingStudent = existingStudentOpt.get();
            existingStudent.setName(studentRequest.name());
            existingStudent.setAge(studentRequest.age());
            existingStudent.setGrade(studentRequest.grade());
            return studentRepository.update(existingStudent);
        }
        throw new StudentNotFoundException("Student with id " + id + " not found");
    }

    @Override
    public void deleteById(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Student with id " + id + " not found");
        }else {
            studentRepository.deleteById(id);
        }
    }

    @Override
    public long count() {
        return studentRepository.count();
    }

    @Override
    public boolean existsById(Long id) {
        if (studentRepository.existsById(id)) {
            return true;
        }else {
            throw new StudentNotFoundException("Student with id " + id + " not found");
        }
    }
}
