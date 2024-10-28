package com.example.demo.service;

import com.example.demo.model.publicación;
import com.example.demo.repository.PublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    // Crear una nueva publicación
    public publicación crearPublicacion(publicación publicacion) {
        return publicacionRepository.save(publicacion);
    }

    // Obtener todas las publicaciones
    public List<publicación> obtenerPublicaciones() {
        return publicacionRepository.findAll();
    }

    // Obtener una publicación por su ID
    public Optional<publicación> obtenerPublicacionPorId(Long id) {
        return publicacionRepository.findById(id);
    }

    // Editar una publicación existente
    public publicación editarPublicacion(Long id, publicación detallesPublicacion) {
        Optional<publicación> publicacionExistente = publicacionRepository.findById(id);
        if (publicacionExistente.isPresent()) {
            publicación publicacion = publicacionExistente.get();
            publicacion.setNom_publicacion(detallesPublicacion.getNom_publicacion());
            publicacion.setGestionar(detallesPublicacion.getGestionar());
            publicacion.setCategoria(detallesPublicacion.getCategoria());
            return publicacionRepository.save(publicacion);
        }
        throw new RuntimeException("Publicación no encontrada"); // Lanzar excepción si no se encuentra
    }

    // Eliminar una publicación
    public void eliminarPublicacion(Long id) {
        if (publicacionRepository.existsById(id)) {
            publicacionRepository.deleteById(id);
        } else {
            throw new RuntimeException("Publicación no encontrada"); // Lanzar excepción si no se encuentra
        }
    }

    // Consultas personalizadas
    public List<publicación> obtenerPublicacionesPorCategoria(String categoria) {
        return publicacionRepository.findByCategoria(categoria);
    }

    public List<publicación> obtenerPublicacionesPorFecha(LocalDate fecha) {
        return publicacionRepository.findByFechaPublicacion(fecha);
    }

    public List<publicación> obtenerPublicacionesPorNombre(String nomPublicacion) {
        return publicacionRepository.findByNomPublicacion(nomPublicacion);
    }

    public List<publicación> obtenerPublicacionesPorRangoFechas(LocalDate startDate, LocalDate endDate) {
        return publicacionRepository.findByFechaPublicacionBetween(startDate, endDate);
    }
}


