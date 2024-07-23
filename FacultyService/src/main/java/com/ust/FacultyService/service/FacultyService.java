package com.ust.FacultyService.service;

import com.ust.FacultyService.model.Faculty;
import com.ust.FacultyService.repository.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepo facultyRepository;
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public List<Faculty> getFaculty() {
        return facultyRepository.findAll();
    }

    public List<Faculty> getByDeptId(String id) {
        return facultyRepository.findAllByDeptId(id);
    }
}
