package com.example.ManagerService.client;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacultyDto {

    String facultyId;
    String facultyName;
    String deptId;
    String contact;
    String managerId;
}
