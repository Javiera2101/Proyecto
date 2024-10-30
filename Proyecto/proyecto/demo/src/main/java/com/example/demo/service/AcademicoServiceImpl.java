package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Academico;
import com.example.demo.repository.AcademicoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AcademicoServiceImpl implements AcademicoService{

    @Autowired 
    AcademicoRepository repAcademico;

    @Override
    public List<Academico> buscarTodosLosAcademicos() {
        return repAcademico.findAll();
    }

    @Override
    public Academico buscarAcademicoPorId(int id) {
        return repAcademico.findById(id).get();
    }

    @Override
    public void Guardar(Academico academico) {
        repAcademico.save(academico);
    }

    @Override
    public void BorrarAcademicoPorId(int id) {
        repAcademico.deleteById(id);
    }
    
}
