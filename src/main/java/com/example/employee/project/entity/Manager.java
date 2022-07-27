package com.example.employee.project.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "manager")
public class Manager {

    @Id
    @Column(name = "managerid")
    private String managerId;
    @Column(name = "managerlastname")
    private String managerLastName;
    @Column(name = "managerfirstname")
    private String managerFirstName;
    @Column(name = "departmentid")
    private String departmentId;
}
