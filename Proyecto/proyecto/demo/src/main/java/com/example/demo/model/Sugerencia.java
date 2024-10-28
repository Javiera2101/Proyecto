package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Sugerencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSugerencia; // Clave primaria
    private String estado; // Estado de la sugerencia
    private String nombreSugerencia; // Nombre de la sugerencia
    private String descripcion; // Descripción de la sugerencia

    // Relación con Estudiante (muchas sugerencias a un estudiante)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    // Relación con Académico (muchas sugerencias a un académico)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "academico_id")
    private Academico academico;

    // Relación con Polo (muchas sugerencias a un polo)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "polo_id")
    private Polo polo;

    // Constructor vacío requerido por JPA
    public Sugerencia() {
    }

    // Constructor con parámetros opcionales
    public Sugerencia(String estado, String nombreSugerencia, String descripcion, Estudiante estudiante, Academico academico, Polo polo) {
        this.estado = estado;
        this.nombreSugerencia = nombreSugerencia;
        this.descripcion = descripcion;
        this.estudiante = estudiante;
        this.academico = academico;
        this.polo = polo;
    }

    // Getters y Setters
    public Long getIdSugerencia() {
        return idSugerencia;
    }

    public void setIdSugerencia(Long idSugerencia) {
        this.idSugerencia = idSugerencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreSugerencia() {
        return nombreSugerencia;
    }

    public void setNombreSugerencia(String nombreSugerencia) {
        this.nombreSugerencia = nombreSugerencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Academico getAcademico() {
        return academico;
    }

    public void setAcademico(Academico academico) {
        this.academico = academico;
    }

    public Polo getPolo() {
        return polo;
    }

    public void setPolo(Polo polo) {
        this.polo = polo;
    }
}

