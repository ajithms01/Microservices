package com.example.ManagerService.controller;

import com.example.ManagerService.model.Manager;
import com.example.ManagerService.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @PostMapping("/addmanager")
    public ResponseEntity<Manager> addManager(@RequestBody Manager manager) {
        Manager savedManager = managerService.addManager(manager);
        return ResponseEntity.ok(savedManager);
    }

    @GetMapping("/getAllManagers")
    public ResponseEntity<List<Manager>> getAllManagers() {
        List<Manager> managers = managerService.getAllManagers();
        return ResponseEntity.ok(managers);
    }
}
