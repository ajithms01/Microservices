package com.ust.FacultyService;

import com.ust.FacultyService.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepo extends JpaRepository<Faculty,String> {
}
