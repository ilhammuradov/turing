package az.edu.turing.springboot04.repository;

import java.sql.*;
import java.util.*;

import az.edu.turing.springboot04.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


@Repository
public class StudentRepository {

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    private Connection connection;

    @PostConstruct
    private void initialize() {
        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int save(Student student) throws SQLException {
        String sql = "INSERT INTO students (name, age, image) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getAge());
            pstmt.setString(3, student.getImage());
            return pstmt.executeUpdate();
        }
    }

    public Student findById(UUID id) throws SQLException {
        String sql = "SELECT * FROM students WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setObject(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Student(
                        UUID.fromString(rs.getString("id")),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("image")
                );
            } else {
                return null;
            }
        }
    }

    public List<Student> findAll() throws SQLException {
        String sql = "SELECT * FROM students";
        List<Student> students = new ArrayList<>();
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                students.add(new Student(
                        UUID.fromString(rs.getString("id")),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("image")
                ));
            }
        }
        return students;
    }

    public int update(Student student) throws SQLException {
        String sql = "UPDATE students SET name = ?, age = ?, image = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getAge());
            pstmt.setString(3, student.getImage());
            pstmt.setObject(4, student.getId());
            return pstmt.executeUpdate();
        }
    }

    public int deleteById(UUID id) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setObject(1, id);
            return pstmt.executeUpdate();
        }
    }
}
