package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Polo;

public interface PoloRepository extends JpaRepository <Polo, Integer>{
    
}
