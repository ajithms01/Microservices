package com.ust.StudentService.controller;

import com.ust.StudentService.model.Student;
import com.ust.StudentService.service.StudentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/addstudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.addStudent(student));
    }

    @GetMapping("/getstudents")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping("/updatestudent/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable String id, @RequestBody Student student){
        return ResponseEntity.ok(studentService.updateStudent(id,student));
    }
}
