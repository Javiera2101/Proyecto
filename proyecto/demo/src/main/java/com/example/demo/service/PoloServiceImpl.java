package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Polo;
import com.example.demo.repository.PoloRepository;

public class PoloServiceImpl implements PoloService {

    @Autowired 
    PoloRepository repPolo;

    @Override
    public List<Polo> buscarPolo() {
        return repPolo.findAll();
    }
    
}
