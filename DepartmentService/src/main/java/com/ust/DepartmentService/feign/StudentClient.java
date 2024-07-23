package com.ust.DepartmentService.feign;

import com.ust.DepartmentService.client.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="studentservice",url = "http://localhost:9098/students")
public interface StudentClient {
    @GetMapping("getByDeptId/{id}")
    public List<Student> getByDeptId(@PathVariable String id);
}
