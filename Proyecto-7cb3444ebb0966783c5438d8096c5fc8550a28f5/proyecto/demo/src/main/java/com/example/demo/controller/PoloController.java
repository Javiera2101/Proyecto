package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Polo;
import com.example.demo.service.PoloService;

@RestController
@RequestMapping("/polo")
public class PoloController {
    
    @Autowired
    PoloService poloService;


    @GetMapping("")
    public List<Polo> list() {
        return poloService.buscarPolo();
    }

}
