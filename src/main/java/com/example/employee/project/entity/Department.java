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
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "departmentid")
    private String departmentId;
    @Column(name = "departmentname")
    private String departmentName;
}
