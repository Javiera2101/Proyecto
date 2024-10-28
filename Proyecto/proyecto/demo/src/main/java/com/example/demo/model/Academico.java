package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "academico")
public class Academico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_academico;
    
    private String nom_academico;
    private String correo_ubb;
    private String contrasena;
    private String departamento;

    // Relación con Sugerencia (uno a muchos)
    @OneToMany(mappedBy = "academico", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sugerencia> sugerencias;

    public int getId_academico() {
        return id_academico;
    }

    public void setId_academico(int id_academico) {
        this.id_academico = id_academico;
    }

    public String getNom_academico() {
        return nom_academico;
    }

    public void setNom_academico(String nom_academico) {
        this.nom_academico = nom_academico;
    }

    public String getCorreo_ubb() {
        return correo_ubb;
    }

    public void setCorreo_ubb(String correo_ubb) {
        this.correo_ubb = correo_ubb;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Sugerencia> getSugerencias() {
        return sugerencias;
    }

    public void setSugerencias(List<Sugerencia> sugerencias) {
        this.sugerencias = sugerencias;
    }
}

