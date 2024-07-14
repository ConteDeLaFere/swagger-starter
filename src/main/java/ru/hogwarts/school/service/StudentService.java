package ru.hogwarts.school.service;

import org.springframework.web.multipart.MultipartFile;
import ru.hogwarts.school.model.Avatar;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.io.IOException;
import java.util.Collection;


public interface StudentService {
    Student getStudent(Long id);
    Student addStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
    Collection<Student> getAllStudents();
    Collection<Student> getStudentsByAge(int age);
    Collection<Student> getStudentsByAgeBetween(int minAge, int maxAge);
    Faculty getFaculty(Long id);
    Avatar findAvatar(Long studentId);
    void uploadAvatar(Long studentId, MultipartFile file) throws IOException;

}
