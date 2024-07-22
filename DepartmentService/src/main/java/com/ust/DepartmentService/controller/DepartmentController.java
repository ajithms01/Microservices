package com.ust.DepartmentService.controller;

import com.ust.DepartmentService.model.Department;
import com.ust.DepartmentService.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/adddepartment")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        return ResponseEntity.ok(departmentService.addDepartment(department));
    }

    @GetMapping("/getdepartments")
    public ResponseEntity<List<Department>> getDepartments() {
        return ResponseEntity.ok(departmentService.getDepartments());
    }

    @PostMapping("/updatedepartment/{id}")
    public ResponseEntity<Department> updateStudent(@PathVariable String id, @RequestBody Department department) {
        return ResponseEntity.ok(departmentService.updateDepartment(id, department));
    }

    @GetMapping("/withstudents/{deptid}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable String id) {
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }
}
