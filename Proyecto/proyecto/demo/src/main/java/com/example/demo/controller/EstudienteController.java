package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Estudiante;
import com.example.demo.service.EstudianteService;

@RestController
@RequestMapping("/estudiante")
public class EstudienteController {
    @Autowired
    EstudianteService estudianteService;

    @GetMapping("")
    public List<Estudiante> list() {
        return estudianteService.buscarTodosLosEstudiantes();
    }
}
