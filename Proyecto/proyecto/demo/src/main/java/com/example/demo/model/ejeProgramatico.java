package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ejeProgramatico")
public class ejeProgramatico {
    private int id_eje;
    private String tipo;
    private String estado_eje;
    private String nombre;
    private int id_polo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_eje() {
        return id_eje;
    }
    public void setId_eje(int id_eje) {
        this.id_eje = id_eje;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEstado_eje() {
        return estado_eje;
    }
    public void setEstado_eje(String estado_eje) {
        this.estado_eje = estado_eje;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId_polo() {
        return id_polo;
    }
    public void setId_polo(int id_polo) {
        this.id_polo = id_polo;
    }

    
}
