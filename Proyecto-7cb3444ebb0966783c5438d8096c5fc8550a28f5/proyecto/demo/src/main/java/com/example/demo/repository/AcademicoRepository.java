package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Academico;

public interface AcademicoRepository extends JpaRepository <Academico, Integer>{
    
}
