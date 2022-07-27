package com.example.employee.project.api;

import com.example.employee.project.entity.Employee;
import com.example.employee.project.entity.Manager;
import com.example.employee.project.service.EmployeeService;
import com.example.employee.project.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @GetMapping("/managerList")
    public ResponseEntity<List<Manager>> getManagers(){
        return new ResponseEntity<>(managerService.getManagers(), HttpStatus.OK);
    }

    @GetMapping("/manager/{id}")
    public ResponseEntity <Manager> getManager(@PathVariable String id){
        return new ResponseEntity<Manager>(managerService.getManagerById(id), HttpStatus.OK);
    }

    @PostMapping("/manager/save")
    public ResponseEntity<Void> saveOrUpdateManager(@RequestBody Manager manager){
        managerService.saveOrUpdateManager(manager);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/manager/delete/{id}")
    public ResponseEntity<Void> deleteManager(@PathVariable String id) {
        managerService.deleteManager(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
