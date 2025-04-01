package com.universidad.model;

import java.time.LocalDate;

import com.universidad.dto.EstudianteDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@SuperBuilder
public class Persona {

    protected Long id;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected LocalDate fechaNacimiento;

    public Persona(){}

    public Persona(Long id, String nombre, String apellido, String email, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public static PersonaBuilder builder() {
        return new PersonaBuilder();
    }

    public static class PersonaBuilder {
        protected Long id;
        protected String nombre;
        protected String apellido;
        protected String email;
        protected LocalDate fechaNacimiento;

        public PersonaBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PersonaBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public PersonaBuilder apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public PersonaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonaBuilder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Persona build() {
            return new Persona(id, nombre, apellido, email, fechaNacimiento) {};
        }

    }
}



