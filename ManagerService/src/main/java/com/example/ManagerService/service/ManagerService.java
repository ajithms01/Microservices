package com.example.ManagerService.service;

import com.example.ManagerService.client.FacultyDto;
import com.example.ManagerService.feign.FacultyClient;
import com.example.ManagerService.model.Manager;
import com.example.ManagerService.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;
    @Autowired
    FacultyClient facultyClient;

    public FacultyDto addFaculty(FacultyDto faculty) {
        return facultyClient.addFaculty(faculty);
    }

    public Manager addManager(Manager manager) {
        return managerRepository.save(manager);
    }

    public List<Manager> getAllManagers() {
        return managerRepository.findAll();
    }
}