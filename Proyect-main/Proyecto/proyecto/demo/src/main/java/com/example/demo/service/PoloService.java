package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Polo;

public interface PoloService {
    
    public List<Polo> buscarPolo();

    public void agregarPolo(Polo polo);
}
