package com.example.employee.project.api;

import com.example.employee.project.entity.Salary;
import com.example.employee.project.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class SalaryController {
    @Autowired
    SalaryService salaryService;

    @GetMapping("/salaryList")
    public ResponseEntity<List<Salary>> getSalaries(){
        return new ResponseEntity<>(salaryService.getSalaries(), HttpStatus.OK);
    }

    @GetMapping("/salary/{id}")
    public ResponseEntity <Salary> getSalary(@PathVariable String id){
        return new ResponseEntity<Salary>(salaryService.getSalaryById(id), HttpStatus.OK);
    }

    @PostMapping("/salary/save")
    public ResponseEntity<Void> saveOrUpdateSalary(@RequestBody Salary salary){
        salaryService.saveOrUpdateSalary(salary);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/salary/delete/{id}")
    public ResponseEntity<Void> deleteSalary(@PathVariable String id) {
        salaryService.deleteSalary(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
