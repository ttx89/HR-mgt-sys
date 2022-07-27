package com.example.employee.project.api;

import com.example.employee.project.entity.Title;
import com.example.employee.project.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TitleController {
    @Autowired
    TitleService titleService;

    @GetMapping("/titleList")
    public ResponseEntity<List<Title>> getTitles(){
        return new ResponseEntity<>(titleService.getTitles(), HttpStatus.OK);
    }

    @GetMapping("/title/{id}")
    public ResponseEntity <Title> getTitle(@PathVariable String id){
        return new ResponseEntity<Title>(titleService.getTitleById(id), HttpStatus.OK);
    }

    @PostMapping("/title/save")
    public ResponseEntity<Void> saveOrUpdateTitle(@RequestBody Title title){
        titleService.saveOrUpdateTitle(title);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/title/delete/{id}")
    public ResponseEntity<Void> deleteTitle(@PathVariable String id) {
        titleService.deleteTitle(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
