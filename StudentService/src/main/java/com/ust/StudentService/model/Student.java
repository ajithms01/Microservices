package com.ust.StudentService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Student")
public class Student {
    @Id
    private String studentId;
    private String StudentName;
    private Integer StudentAge;
    private String courseId;
    private String city;
    private String deptId;
}
