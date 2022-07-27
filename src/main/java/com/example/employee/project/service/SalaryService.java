package com.example.employee.project.service;

import com.example.employee.project.entity.Salary;
import com.example.employee.project.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {
    @Autowired
    SalaryRepository salaryRepository;

    public List<Salary> getSalaries(){
        return salaryRepository.findAll();
    }

    public Salary getSalaryById(String id){
        return salaryRepository.findById(id).get();

    }

    public void saveOrUpdateSalary(Salary salary){
        salaryRepository.save(salary);
    }

    public void deleteSalary(String id) {
        salaryRepository.deleteById(id);
    }
}
