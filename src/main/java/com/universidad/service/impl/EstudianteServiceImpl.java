package com.universidad.service.impl;

import com.universidad.dto.EstudianteDTO;
import com.universidad.model.Estudiante;
import com.universidad.repository.EstudianteRepository;
import com.universidad.service.IEstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<EstudianteDTO> obtenerTodosLosEstudiantes() {
        return estudianteRepository.findAll().stream()
                .map(this::convertirAEstudianteDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<EstudianteDTO> obtenerEstudiantePorId(Long id) {
        return estudianteRepository.findById(id).map(this::convertirAEstudianteDTO);
    }

    @Override
    public EstudianteDTO crearEstudiante(EstudianteDTO estudianteDTO) {  // Metodo corregido
        Estudiante estudiante = convertirAEstudianteEntidad(estudianteDTO);
        estudiante = estudianteRepository.save(estudiante);
        return convertirAEstudianteDTO(estudiante);
    }
    @Override
    public Optional<EstudianteDTO> actualizarEstudiante(Long id, EstudianteDTO estudianteDTO) {
        return estudianteRepository.findById(id).map(estudianteExistente -> {
            estudianteExistente.setNombre(estudianteDTO.getNombre());
            estudianteExistente.setApellido(estudianteDTO.getApellido());
            estudianteExistente.setEmail(estudianteDTO.getEmail());
            estudianteExistente.setFechaNacimiento(estudianteDTO.getFechaNacimiento());
            estudianteExistente.setNumeroInscripcion(estudianteDTO.getNumeroInscripcion());

            Estudiante estudianteActualizado = estudianteRepository.save(estudianteExistente);
            return convertirAEstudianteDTO(estudianteActualizado);
        });
    }

    @Override
    public boolean eliminarEstudiante(Long id) {
        if (estudianteRepository.findById(id).isPresent()) {
            estudianteRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private EstudianteDTO convertirAEstudianteDTO(Estudiante estudiante) {
        return EstudianteDTO.builder()
                .id(estudiante.getId())
                .nombre(estudiante.getNombre())
                .apellido(estudiante.getApellido())
                .email(estudiante.getEmail())
                .fechaNacimiento(estudiante.getFechaNacimiento())
                .numeroInscripcion(estudiante.getNumeroInscripcion())
                .build();
    }

    private Estudiante convertirAEstudianteEntidad(EstudianteDTO estudianteDTO) {
        return Estudiante.builder()
                .id(estudianteDTO.getId())
                .nombre(estudianteDTO.getNombre())
                .apellido(estudianteDTO.getApellido())
                .email(estudianteDTO.getEmail())
                .fechaNacimiento(estudianteDTO.getFechaNacimiento())
                .numeroInscripcion(estudianteDTO.getNumeroInscripcion())
                .build();
    }
}