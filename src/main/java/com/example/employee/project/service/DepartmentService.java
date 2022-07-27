package com.example.employee.project.service;

import com.example.employee.project.entity.Department;
import com.example.employee.project.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getDepartments(){
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(String id){
        return departmentRepository.findById(id).get();

    }

    public void saveOrUpdateDepartment(Department department){
        departmentRepository.save(department);
    }

    public void deleteDepartment(String id) {
        departmentRepository.deleteById(id);
    }
}
