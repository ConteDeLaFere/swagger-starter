package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;

import java.util.Collection;
import java.util.List;

public interface FacultyService {
    Faculty getFaculty(Long id);
    Faculty addFaculty(Faculty faculty);
    Faculty updateFaculty(Faculty faculty);
    void deleteFaculty(Long id);
    Collection<Faculty> getAllFaculties();
    List<Faculty> getFacultiesByColor(String color);
}
