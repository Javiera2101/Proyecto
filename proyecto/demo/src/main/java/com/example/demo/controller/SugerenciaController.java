package com.example.demo.controller;

import com.example.demo.model.Sugerencia;
import com.example.demo.service.SugerenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sugerencias")
public class SugerenciaController {

    @Autowired
    private SugerenciaService sugerenciaService;

    @PostMapping("/crear")
    public ResponseEntity<Sugerencia> crearSugerencia(@RequestBody Sugerencia sugerencia) {
        Sugerencia nuevaSugerencia = sugerenciaService.crearSugerencia(sugerencia);
        return new ResponseEntity<>(nuevaSugerencia, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Sugerencia>> obtenerSugerencias() {
        List<Sugerencia> sugerencias = sugerenciaService.obtenerSugerencias();
        return new ResponseEntity<>(sugerencias, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sugerencia> editarSugerencia(@PathVariable Long id, @RequestBody Sugerencia sugerencia) {
        Sugerencia sugerenciaEditada = sugerenciaService.editarSugerencia(id, sugerencia);
        return new ResponseEntity<>(sugerenciaEditada, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarSugerencia(@PathVariable Long id) {
        sugerenciaService.eliminarSugerencia(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
