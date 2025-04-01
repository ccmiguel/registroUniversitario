package com.universidad.controller; // Define el paquete al que pertenece esta clase

import com.universidad.dto.EstudianteDTO; // Importa la clase EstudianteDTO del paquete dto
import com.universidad.service.IEstudianteService; // Importa la interfaz IEstudianteService del paquete service

import org.springframework.beans.factory.annotation.Autowired; // Importa la anotación Autowired de Spring
import org.springframework.http.ResponseEntity; // Importa la clase ResponseEntity de Spring para manejar respuestas HTTP
import org.springframework.web.bind.annotation.*; // Importa las anotaciones de Spring para controladores web



import java.util.List; // Importa la interfaz List para manejar listas
import java.util.Optional;

@RestController // Anotación que indica que esta clase es un controlador REST de Spring
@RequestMapping("/api/estudiantes") // Define la ruta base para las solicitudes HTTP a este controlador
public class EstudianteController { // Define la clase EstudianteController

    private final IEstudianteService estudianteService; // Declara una variable final para el servicio de estudiantes

    @Autowired // Anotación que indica que el constructor debe ser usado para inyección de dependencias
    public EstudianteController(IEstudianteService estudianteService) { // Constructor que recibe el servicio de estudiantes
        this.estudianteService = estudianteService; // Asigna el servicio de estudiantes a la variable de instancia
    }

    @GetMapping
    public ResponseEntity<List<EstudianteDTO>> obtenerTodos() {
        return ResponseEntity.ok(estudianteService.obtenerTodosLosEstudiantes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstudianteDTO> obtenerPorId(@PathVariable Long id) {
        Optional<EstudianteDTO> estudiante = estudianteService.obtenerEstudiantePorId(id);
        return estudiante.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EstudianteDTO> crear(@RequestBody EstudianteDTO estudianteDTO) {
        EstudianteDTO nuevoEstudiante = estudianteService.crearEstudiante(estudianteDTO);
        return ResponseEntity.status(201).body(nuevoEstudiante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstudianteDTO> actualizar(@PathVariable Long id, @RequestBody EstudianteDTO estudianteDTO) {
        Optional<EstudianteDTO> estudianteActualizado = estudianteService.actualizarEstudiante(id, estudianteDTO);
        return estudianteActualizado.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEstudiante(@PathVariable Long id) {
        estudianteService.eliminarEstudiante(id);
        return ResponseEntity.noContent().build();
    }

}