package com.example.employee.project.service;

import com.example.employee.project.entity.Manager;
import com.example.employee.project.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;

    public List<Manager> getManagers(){
        return managerRepository.findAll();
    }

    public Manager getManagerById(String id){
        return managerRepository.findById(id).get();

    }

    public void saveOrUpdateManager(Manager manager){
        managerRepository.save(manager);
    }

    public void deleteManager(String id) {
        managerRepository.deleteById(id);
    }
}
