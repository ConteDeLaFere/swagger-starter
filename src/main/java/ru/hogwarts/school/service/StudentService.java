package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Student;

import java.util.Collection;
import java.util.List;

public interface StudentService {
    Student getStudent(Long id);
    Student addStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
    Collection<Student> getAllStudents();
    List<Student> getStudentsByAge(int age);
}
