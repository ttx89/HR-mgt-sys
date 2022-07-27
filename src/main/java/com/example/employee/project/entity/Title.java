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
@Table(name = "title")
public class Title {

    @Id
    @Column(name = "title")
    private String title;
    @Column(name = "fromdate")
    private String fromDate;
    @Column(name = "todate")
    private String toDate;
    @Column(name = "employeeid")
    private int employeeId;
}
