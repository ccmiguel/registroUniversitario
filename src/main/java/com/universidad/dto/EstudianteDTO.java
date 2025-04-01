package com.universidad.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class EstudianteDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
    private String numeroInscripcion;

    public EstudianteDTO(Long id, String nombre, String apellido, String email, LocalDate fechaNacimiento, String numeroInscripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroInscripcion = numeroInscripcion;
    }

    public static EstudianteDTO.EstudianteDTOBuilder builder() {
        return new EstudianteDTO.EstudianteDTOBuilder();
    }

    public EstudianteDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(String numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public static class EstudianteDTOBuilder {
        private Long id;
        private String nombre;
        private String apellido;
        private String email;
        private LocalDate fechaNacimiento;
        private String numeroInscripcion;

        public EstudianteDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public EstudianteDTOBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EstudianteDTOBuilder apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public EstudianteDTOBuilder email(String email) {
            this.email = email;
            return this;
        }

        public EstudianteDTOBuilder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public EstudianteDTOBuilder numeroInscripcion(String numeroInscripcion) {
            this.numeroInscripcion = numeroInscripcion;
            return this;
        }

        public EstudianteDTO build() {
            return new EstudianteDTO(id, nombre, apellido, email, fechaNacimiento, numeroInscripcion);
        }
    }


}