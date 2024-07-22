package com.ust.DepartmentService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String studentId;
    private String StudentName;
    private Integer StudentAge;
    private String courseId;
    private String city;
    private String deptId;
}
