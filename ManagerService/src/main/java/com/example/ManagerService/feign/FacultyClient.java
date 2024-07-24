package com.example.ManagerService.feign;

import com.example.ManagerService.client.FacultyDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name="FacultyService",url = "http://localhost:8181/faculty")
public interface FacultyClient {
    @PostMapping("/addfaculty")
    public FacultyDto addFaculty(@RequestBody FacultyDto faculty) ;
}
