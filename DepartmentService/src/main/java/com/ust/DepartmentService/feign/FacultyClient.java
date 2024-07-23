package com.ust.DepartmentService.feign;

import com.ust.DepartmentService.client.Faculty;
import com.ust.DepartmentService.client.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="FacultyService",url = "http://localhost:8181/faculty")
public interface FacultyClient {
    @GetMapping("getByDeptId/{id}")
    public List<Faculty> getByDeptId(@PathVariable String id);
}