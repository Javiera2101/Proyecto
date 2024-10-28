package com.example.demo.repository;

import com.example.demo.model.publicación;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PublicacionRepository extends JpaRepository<publicación, Long> {
    // Consulta para encontrar publicaciones por categoría
    List<publicación> findByCategoria(String categoria);

    // Consulta para encontrar publicaciones por fecha
    List<publicación> findByFechaPublicacion(LocalDate fecha);

    // Consulta para encontrar publicaciones por nombre
    List<publicación> findByNomPublicacion(String nomPublicacion);

    // Consulta para encontrar publicaciones en un rango de fechas
    List<publicación> findByFechaPublicacionBetween(LocalDate startDate, LocalDate endDate);
}

    


