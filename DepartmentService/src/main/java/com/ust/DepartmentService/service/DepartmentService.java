package com.ust.DepartmentService.service;

import com.netflix.discovery.converters.Auto;
import com.ust.DepartmentService.client.FullResponse;
import com.ust.DepartmentService.feign.StudentClient;
import com.ust.DepartmentService.model.Department;
import com.ust.DepartmentService.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    StudentClient studentClient;


    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    public Department updateDepartment(String id, Department department) {
        Department existingDepartment = departmentRepository.findById(id).orElse(null);
        if (existingDepartment != null) {
            existingDepartment.setDeptId(department.getDeptId());
            existingDepartment.setDeptName(department.getDeptName());
            existingDepartment.setDescription(department.getDescription());
            existingDepartment.setLocation(department.getLocation());
            existingDepartment.setManagerId(department.getManagerId());
            return departmentRepository.save(existingDepartment);
        }
        return null;
    }

    public FullResponse getDepartmentById(String id) {
        Department department = departmentRepository.findById(id).orElse(null);
        FullResponse fullResponse=new FullResponse();
        fullResponse.setDeptId(department.getDeptId());
        fullResponse.setDeptName(department.getDeptName());
        fullResponse.setStudents(studentClient.getByDeptId(id));
        return fullResponse;
    }
}
