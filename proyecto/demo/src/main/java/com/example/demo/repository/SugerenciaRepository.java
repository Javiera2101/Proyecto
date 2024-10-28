package com.example.demo.repository;
import com.example.demo.model.Academico;
import com.example.demo.model.Estudiante;
import com.example.demo.model.Polo;
import com.example.demo.model.Sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query; // Asegúrate de importar esta clase
import org.springframework.data.repository.query.Param; // Asegúrate de importar esta clase

@Repository
public interface SugerenciaRepository extends JpaRepository<Sugerencia, Long> {

    // Obtener sugerencias ordenadas por fecha de creación
    List<Sugerencia> findAllByOrderByFechaCreacionAsc(); // Orden ascendente
    List<Sugerencia> findAllByOrderByFechaCreacionDesc(); // Orden descendente

    // Obtener sugerencias por estudiante
    List<Sugerencia> findByEstudiante(Estudiante estudiante);
    
    // Obtener sugerencias por académico
    List<Sugerencia> findByAcademico(Academico academico);
    
    // Obtener sugerencias por polo
    List<Sugerencia> findByPolo(Polo polo);
    
    // Ejemplo de consulta para obtener sugerencias por estado y ordenadas por fecha
    @Query("SELECT s FROM Sugerencia s WHERE s.estado = :estado ORDER BY s.fechaCreacion DESC")
    List<Sugerencia> findByEstadoOrderByFechaCreacionDesc(@Param("estado") String estado);
}
