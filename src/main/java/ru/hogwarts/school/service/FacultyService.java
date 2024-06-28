package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.Collection;

public interface FacultyService {
    Faculty getFaculty(Long id);
    Faculty addFaculty(Faculty faculty);
    Faculty updateFaculty(Faculty faculty);
    void deleteFaculty(Long id);
    Collection<Faculty> getAllFaculties();
    Collection<Faculty> getFacultiesByColor(String color);
    Collection<Faculty> getFacultiesByNameOrColor(String name, String color);
    Collection<Student> getStudentsByFaculty(Long id);
}
