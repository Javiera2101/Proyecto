package com.example.demo.controller;

import com.example.demo.model.publicación; // Asegúrate de que esta clase esté en el paquete correcto
import com.example.demo.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/publicaciones")
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

    @PostMapping("/crear")
    public ResponseEntity<publicación> crearPublicacion(@RequestBody publicación publicacion) {
        // Crear una nueva publicación a través del servicio
        publicación nuevaPublicacion = publicacionService.crearPublicacion(publicacion);
        return new ResponseEntity<>(nuevaPublicacion, HttpStatus.CREATED);
    }
}

