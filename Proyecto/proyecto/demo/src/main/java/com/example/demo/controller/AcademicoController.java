package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Academico;
import com.example.demo.service.AcademicoService;

@RestController
@RequestMapping("/academico")
public class AcademicoController {
    @Autowired
    AcademicoService academicoService;

    @GetMapping("")
    public List<Academico> list() {
        return academicoService.buscarTodosLosAcademicos();
    }
}
