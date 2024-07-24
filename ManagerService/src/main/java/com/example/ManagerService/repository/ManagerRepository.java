package com.example.ManagerService.repository;

import com.example.ManagerService.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,String> {
}
