package com.ust.FacultyService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Faculty {
    @Id
    String facultyId;
    String facultyName;
    String deptId;
    String contact;
}
