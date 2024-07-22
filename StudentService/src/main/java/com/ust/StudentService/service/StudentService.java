package com.ust.StudentService.service;

import com.netflix.discovery.converters.Auto;
import com.ust.StudentService.model.Student;
import com.ust.StudentService.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(String id,Student student) {
        Student studentWithId=studentRepository.findById(id).get();
        studentWithId.setStudentId(student.getStudentId());
        studentWithId.setStudentName(student.getStudentName());
        studentWithId.setStudentAge(student.getStudentAge());
        studentWithId.setCity(student.getCity());
        studentWithId.setDeptId(student.getDeptId());
        studentWithId.setCourseId(student.getCourseId());
        return studentRepository.save(studentWithId);
    }
}
