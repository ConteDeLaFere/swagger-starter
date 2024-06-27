package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;

import java.util.List;

public interface FacultyService {
    Faculty getFaculty(Long id);
    Faculty addFaculty(Faculty faculty);
    Faculty updateFaculty(Long id, Faculty faculty);
    void deleteFaculty(Long id);
    List<Faculty> getAllFaculties();
    List<Faculty> getFacultiesByColor(String color);
}
