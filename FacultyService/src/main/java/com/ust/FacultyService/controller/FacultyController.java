package com.ust.FacultyService.controller;

import com.ust.FacultyService.model.Faculty;
import com.ust.FacultyService.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    FacultyService facultyService;

    @PostMapping("/addfaculty")
    public ResponseEntity<Faculty> addFaculty(@RequestBody Faculty faculty) {
        return ResponseEntity.ok(facultyService.addFaculty(faculty));
    }

    @GetMapping("/getfaculty")
    public ResponseEntity<List<Faculty>> getAllFaculty() {
        return ResponseEntity.ok(facultyService.getFaculty());
    }
    @GetMapping("getByDeptId/{id}")
    public ResponseEntity<List<Faculty>> getByDeptId(@PathVariable String id){
        return ResponseEntity.ok(facultyService.getByDeptId(id));
    }
}
