package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository <Estudiante, Integer>{
    
}
