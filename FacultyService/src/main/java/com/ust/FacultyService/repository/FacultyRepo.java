package com.ust.FacultyService.repository;

import com.ust.FacultyService.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyRepo extends JpaRepository<Faculty,String> {
    List<Faculty> findAllByDeptId(String id);
}
