package com.ust.DepartmentService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty {
    String facultyId;
    String facultyName;
    String deptId;
    String contact;
}
