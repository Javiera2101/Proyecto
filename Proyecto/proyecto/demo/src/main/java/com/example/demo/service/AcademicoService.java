package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Academico;

public interface AcademicoService {
    
    public List<Academico> buscarTodosLosAcademicos();
    
    public Academico buscarAcademicoPorId(int id);
    
    public void Guardar(Academico academico);
    
    public void BorrarAcademicoPorId(int id);
}
