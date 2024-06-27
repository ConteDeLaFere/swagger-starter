package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final HashMap<Long, Student> students;
    private Long studentId = 0L;

    public StudentServiceImpl() {
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

    public Student updateStudent(Long id, Student student) {
        if (!students.containsKey(id)) {
            return null;
        }
        students.put(id, student);
        return student;
    }

    public void deleteStudent(Long id) {
        students.remove(id);
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
