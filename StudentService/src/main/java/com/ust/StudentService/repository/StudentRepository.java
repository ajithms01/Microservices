package com.ust.StudentService.repository;

import com.ust.StudentService.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
    List<Student> findAllByDeptId(String id);
}
