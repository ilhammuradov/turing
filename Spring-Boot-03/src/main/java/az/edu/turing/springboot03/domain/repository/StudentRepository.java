package az.edu.turing.springboot03.domain.repository;

import az.edu.turing.springboot03.domain.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    private final RowMapper<Student> studentRowMapper = (rs, rowNum) -> new Student(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getInt("age"),
            rs.getLong("grade")
    );

    public Student save(Student student) {
        jdbcTemplate.update("INSERT INTO students (name, age, grade) VALUES (?, ?, ?)",
                student.getName(), student.getAge(), student.getGrade());
        Long id = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Long.class);
        student.setId(id);
        return student;
    }

    public Student update(Student student) {
        jdbcTemplate.update("UPDATE students SET name = ?, age = ?, grade = ? WHERE id = ?",
                student.getName(), student.getAge(), student.getGrade(), student.getId());
        return student;
    }

    public Optional<Student> findById(Long id) {
        List<Student> students = jdbcTemplate.query("SELECT * FROM students WHERE id = ?", studentRowMapper, id);
        return students.isEmpty() ? Optional.empty() : Optional.of(students.get(0));
    }

    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * FROM students", studentRowMapper);
    }

    public void deleteById(Long id) {
        jdbcTemplate.update("DELETE FROM students WHERE id = ?", id);
    }

    public long count() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM students", Long.class);
    }

    public boolean existsById(Long id) {
        Integer count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM students WHERE id = ?", Integer.class, id);
        return count != null && count > 0;
    }
}
