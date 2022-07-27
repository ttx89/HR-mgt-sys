package com.example.employee.project.api;

import com.example.employee.project.entity.Department;
import com.example.employee.project.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/departmentList")
    public ResponseEntity<List<Department>> getEmployees(){
        return new ResponseEntity<>(departmentService.getDepartments(), HttpStatus.OK);
    }

    @GetMapping("/department/{id}")
    public ResponseEntity <Department> getEmployee(@PathVariable String id){
        return new ResponseEntity<Department>(departmentService.getDepartmentById(id), HttpStatus.OK);
    }

    @PostMapping("/department/save")
    public ResponseEntity<Void> saveOrUpdateEmployee(@RequestBody Department employee){
        departmentService.saveOrUpdateDepartment(employee);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/department/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String id) {
        departmentService.deleteDepartment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
