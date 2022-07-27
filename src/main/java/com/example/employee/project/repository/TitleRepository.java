package com.example.employee.project.repository;

import com.example.employee.project.entity.Title;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRepository extends JpaRepository<Title, String> {
}
