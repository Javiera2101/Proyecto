package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class publicación {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_publicacion;

    private String nom_publicacion;

    private String gestionar;

    private String categoria;

    private LocalDate fechaPublicacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "polo_id")
    private Polo polo;

    // Constructor vacío requerido por JPA
    public publicación() {
    }

    // Constructor con parámetros opcionales
    public publicación(String nom_publicacion, String gestionar, String categoria, Polo polo) {
        this.nom_publicacion = nom_publicacion;
        this.gestionar = gestionar;
        this.categoria = categoria;
        this.fechaPublicacion = LocalDate.now(); // La fecha será el día actual
        this.polo = polo;
    }

    // Getters y Setters
    public Long getId_publicacion() {
        return id_publicacion;
    }

    public void setId_publicacion(Long id_publicacion) {
        this.id_publicacion = id_publicacion;
    }

    public String getNom_publicacion() {
        return nom_publicacion;
    }

    public void setNom_publicacion(String nom_publicacion) {
        this.nom_publicacion = nom_publicacion;
    }

    public String getGestionar() {
        return gestionar;
    }

    public void setGestionar(String gestionar) {
        this.gestionar = gestionar;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Polo getPolo() {
        return polo;
    }

    public void setPolo(Polo polo) {
        this.polo = polo;
    }
}
