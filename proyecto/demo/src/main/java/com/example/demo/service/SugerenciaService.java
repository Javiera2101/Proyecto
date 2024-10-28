package com.example.demo.service;

import com.example.demo.model.Sugerencia;
import com.example.demo.repository.SugerenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SugerenciaService {

    @Autowired
    private SugerenciaRepository sugerenciaRepository;

    public Sugerencia crearSugerencia(Sugerencia sugerencia) {
        // Puedes agregar validaciones aquí si es necesario
        return sugerenciaRepository.save(sugerencia);
    }

    public List<Sugerencia> obtenerSugerencias() {
        return sugerenciaRepository.findAll();
    }

    public Sugerencia editarSugerencia(Long id, Sugerencia sugerencia) {
        Sugerencia sugerenciaExistente = sugerenciaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Sugerencia no encontrada con ID: " + id));

        // Actualiza los campos según lo proporcionado
        sugerenciaExistente.setEstado(sugerencia.getEstado());
        sugerenciaExistente.setNombreSugerencia(sugerencia.getNombreSugerencia());
        sugerenciaExistente.setDescripcion(sugerencia.getDescripcion());
        
        return sugerenciaRepository.save(sugerenciaExistente);
    }
    
    public void eliminarSugerencia(Long id) {
        sugerenciaRepository.deleteById(id);
    }
}

