package com.example.employee.project.service;

import com.example.employee.project.entity.Title;
import com.example.employee.project.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService {
    @Autowired
    TitleRepository titleRepository;

    public List<Title> getTitles(){
        return titleRepository.findAll();
    }

    public Title getTitleById(String id){
        return titleRepository.findById(id).get();

    }

    public void saveOrUpdateTitle(Title title){
        titleRepository.save(title);
    }

    public void deleteTitle(String id) {
        titleRepository.deleteById(id);
    }
}
