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
@Table(name = "salary")
public class Salary {

    @Id
    @Column(name = "salaryid")
    private String salaryId;
    @Column(name = "basesalary")
    private String baseSalary;
    @Column(name = "commission")
    private String commission;
    @Column(name = "employeeid")
    private int employeeId;
}
