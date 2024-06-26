package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class FacultyService {

    private final HashMap<Long, Faculty> faculties;
    private Long facultyId = 0L;

    public FacultyService() {
        faculties = new HashMap<>();
    }

    public Faculty getFaculty(Long id) {
        return faculties.get(id);
    }

    public Faculty addFaculty(Faculty faculty) {
        faculty.setId(++facultyId);
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty updateFaculty(Faculty faculty) {
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty removeFaculty(Faculty faculty) {
        return faculties.remove(faculty.getId());
    }

    public List<Faculty> getAllFaculties() {
        return new ArrayList<>(faculties.values());
    }

    public List<Faculty> getFacultiesByColor(String color) {
        return faculties.values().stream()
                .filter(faculty -> faculty.getColor().equals(color))
                .toList();
    }
}
