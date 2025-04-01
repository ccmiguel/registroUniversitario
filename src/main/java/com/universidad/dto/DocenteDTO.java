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
public class DocenteDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
    private String nroEmpleado;
    private String departmento;

    public DocenteDTO(){}

    public DocenteDTO(Long id, String nombre, String apellido, String email, LocalDate fechaNacimiento, String nroEmpleado, String departmento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.nroEmpleado = nroEmpleado;
        this.departmento = departmento;
    }

    public static DocenteDTOBuilder builder() {
        return new DocenteDTOBuilder();
    }

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

    public String getNroEmpleado() {
        return nroEmpleado;
    }

    public void setNroEmpleado(String nroEmpleado) {
        this.nroEmpleado = nroEmpleado;
    }

    public String getDepartmento() {
        return departmento;
    }

    public void setDepartmento(String departmento) {
        this.departmento = departmento;
    }

    public static class DocenteDTOBuilder {
        private Long id;
        private String nombre;
        private String apellido;
        private String email;
        private LocalDate fechaNacimiento;
        private String nroEmpleado;
        private String departmento;

        public DocenteDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public DocenteDTOBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public DocenteDTOBuilder apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public DocenteDTOBuilder email(String email) {
            this.email = email;
            return this;
        }

        public DocenteDTOBuilder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public DocenteDTOBuilder nroEmpleado(String nroEmpleado) {
            this.nroEmpleado = nroEmpleado;
            return this;
        }

        public DocenteDTOBuilder departmento(String departmento) {
            this.departmento = departmento;
            return this;
        }

        public DocenteDTO build() {
            return new DocenteDTO(id, nombre, apellido, email, fechaNacimiento, nroEmpleado, departmento);
        }
    }
}

