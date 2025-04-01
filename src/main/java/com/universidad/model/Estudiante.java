package com.universidad.model;

import lombok.AllArgsConstructor; // Importa la anotación AllArgsConstructor de Lombok para generar un constructor con todos los argumentos
import lombok.Data; // Importa la anotación Data de Lombok para generar getters, setters, toString, equals y hashCode
//import lombok.EqualsAndHashCode; // Importa la anotación EqualsAndHashCode de Lombok para generar métodos equals y hashCode
import lombok.NoArgsConstructor; // Importa la anotación NoArgsConstructor de Lombok para generar un constructor sin argumentos
import lombok.experimental.SuperBuilder; // Importa la anotación SuperBuilder de Lombok para generar un builder que soporta herencia

import java.time.LocalDate;

//@Data // Genera getters, setters, toString, equals y hashCode
//@EqualsAndHashCode(callSuper = true) // Genera métodos equals y hashCode, incluyendo los campos de la clase padre
//@NoArgsConstructor // Genera un constructor sin argumentos
//@AllArgsConstructor // Genera un constructor con todos los argumentos
//@SuperBuilder // Genera un builder que soporta herencia
public class Estudiante extends Persona { // Define la clase Estudiante que extiende de Persona

    private String numeroInscripcion; // Campo para almacenar el número de inscripción del estudiante

    public Estudiante() {}

    public Estudiante(String numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public Estudiante(Long id, String nombre, String apellido, String email, LocalDate fechaNacimiento, String numeroInscripcion) {
        super(id, nombre, apellido, email, fechaNacimiento);
        this.numeroInscripcion = numeroInscripcion;
    }

    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(String numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }


    public static EstudianteBuilder builder() {
        return new EstudianteBuilder();
    }

    // Clase EstudianteBuilder que extiende de PersonaBuilder
    public static class EstudianteBuilder extends Persona.PersonaBuilder {
        private String numeroInscripcion;



        @Override
        public EstudianteBuilder id(Long id) {
            super.id(id);
            return this;
        }

        @Override
        public EstudianteBuilder nombre(String nombre) {
            super.nombre(nombre);
            return this;
        }

        @Override
        public EstudianteBuilder apellido(String apellido) {
            super.apellido(apellido);
            return this;
        }

        @Override
        public EstudianteBuilder email(String email) {
            super.email(email);
            return this;
        }

        @Override
        public EstudianteBuilder fechaNacimiento(LocalDate fechaNacimiento) {
            super.fechaNacimiento(fechaNacimiento);
            return this;
        }

        public EstudianteBuilder numeroInscripcion(String numeroInscripcion) {
            this.numeroInscripcion = numeroInscripcion;
            return this;
        }

        @Override
        public Estudiante build() {
            Estudiante estudiante = new Estudiante();
            estudiante.setId(super.id);
            estudiante.setNombre(super.nombre);
            estudiante.setApellido(super.apellido);
            estudiante.setEmail(super.email);
            estudiante.setFechaNacimiento(super.fechaNacimiento);
            estudiante.setNumeroInscripcion(this.numeroInscripcion);
            return estudiante;
        }
    }



}