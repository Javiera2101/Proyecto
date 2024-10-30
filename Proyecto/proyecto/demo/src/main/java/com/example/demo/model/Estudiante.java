package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "estudiante")
public class Estudiante {
    private int id_estudiante;
    private String nombre_estudiante;
    private String correo_estudiante;
    private String carrera_estudiante;
    private String rol_estudiante;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_estudiante() {
        return id_estudiante;
    }
    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }
    public String getNombre_estudiante() {
        return nombre_estudiante;
    }
    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }
    public String getCorreo_estudiante() {
        return correo_estudiante;
    }
    public void setCorreo_estudiante(String correo_estudiante) {
        this.correo_estudiante = correo_estudiante;
    }
    public String getCarrera_estudiante() {
        return carrera_estudiante;
    }
    public void setCarrera_estudiante(String carrera_estudiante) {
        this.carrera_estudiante = carrera_estudiante;
    }

    public String getrol_estudiante() {
        return rol_estudiante;
    }
    public void setrol_estudiante(String rol_estudiante) {
        this.rol_estudiante = rol_estudiante;
    }

}
