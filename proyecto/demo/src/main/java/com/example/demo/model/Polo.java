package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "polo")
public class Polo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_polo;
    
    private String nombre_polo;
    private String correo_polo;
    private String contrasena_polo;
    private int num_telefono;

    // Relación con Sugerencia (uno a muchos)
    @OneToMany(mappedBy = "polo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sugerencia> sugerencias;

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

    public List<Sugerencia> getSugerencias() {
        return sugerencias;
    }

    public void setSugerencias(List<Sugerencia> sugerencias) {
        this.sugerencias = sugerencias;
    }
}

