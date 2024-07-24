package com.example.ManagerService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.internal.build.AllowNonPortable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manager {
    @Id
    String managerId;
    String managerName;
    String contact;

}
