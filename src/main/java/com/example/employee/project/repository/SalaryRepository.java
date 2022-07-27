package com.example.employee.project.repository;

import com.example.employee.project.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, String> {
}
