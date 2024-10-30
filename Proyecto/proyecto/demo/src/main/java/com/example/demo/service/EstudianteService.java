package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Estudiante;

public interface EstudianteService {

    public List<Estudiante> buscarTodosLosEstudiantes();
    
    public Estudiante buscarEstudiantePorId(int id);
    
    public void Guardar(Estudiante estudiante);
    
    public void BorrarEstudiantePorId(int id);

}
