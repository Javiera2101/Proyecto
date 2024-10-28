package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "polo")
public class Polo {
    private int id_polo;
    private String nombre_polo;
    private String correo_polo;
    private String contrasena_polo;
    private int num_telefono;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_polo() {
        return id_polo;
    }
    public void setId_polo(int id_polo) {
        this.id_polo = id_polo;
    }
    public String getNombre_polo() {
        return nombre_polo;
    }
    public void setNombre_polo(String nombre_polo) {
        this.nombre_polo = nombre_polo;
    }
    public String getCorreo_polo() {
        return correo_polo;
    }
    public void setCorreo_polo(String correo_polo) {
        this.correo_polo = correo_polo;
    }
    public String getContrasena_polo() {
        return contrasena_polo;
    }
    public void setContrasena_polo(String contrasena_polo) {
        this.contrasena_polo = contrasena_polo;
    }
    public int getNum_telefono() {
        return num_telefono;
    }
    public void setNum_telefono(int num_telefono) {
        this.num_telefono = num_telefono;
    }

    
}
