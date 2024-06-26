package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentService {

    private final HashMap<Long, Student> students;
    private Long studentId = 0L;

    public StudentService() {
        students = new HashMap<>();
    }

    public Student getStudent(Long studentId) {
        return students.get(studentId);
    }

    public Student addStudent(Student student) {
        student.setId(++studentId);
        students.put(student.getId(), student);
        return student;
    }

    public Student updateStudent(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    public Student removeStudent(Student student) {
        return students.remove(student.getId());
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public List<Student> getStudentsByAge(int age) {
        return students.values().stream()
                .filter(student -> student.getAge() == age)
                .toList();
    }

}
