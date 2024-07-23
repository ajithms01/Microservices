package com.ust.DepartmentService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacultyResponse {
    private String deptId;
    private String deptName;
    private List<Faculty> faculty;
}


