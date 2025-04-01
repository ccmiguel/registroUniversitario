package com.universidad.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
//@NoArgsConstructor
@AllArgsConstructor
//@SuperBuilder
public class Docente extends Persona {
    private String nroEmpleado;
    private String departamento;

    public Docente(){}

    public Docente(String nroEmpleado) {
        this.nroEmpleado = nroEmpleado;
    }

    public Docente(Long id, String nombre, String apellido, String email, LocalDate fechaNacimiento, String nroEmpleado) {
        super(id, nombre, apellido, email, fechaNacimiento);
        this.nroEmpleado = nroEmpleado;
    }

    public String getNroEmpleado() {
        return nroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNroEmpleado(String nroEmpleado) {
        this.nroEmpleado = nroEmpleado;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public static DocenteBuilder builder() {
        return new DocenteBuilder();
    }

    public static class DocenteBuilder extends PersonaBuilder {
        private String nroEmpleado;
        private String departamento;

        public DocenteBuilder nroEmpleado(String nroEmpleado) {
            this.nroEmpleado = nroEmpleado;
            return this;
        }

        public DocenteBuilder departamento(String departamento) {
            this.departamento = departamento;
            return this;
        }

//        @Override
//        public Docente build() {
//            Docente docente = new Docente(super.id, super.nombre, super.apellido, super.email, super.fechaNacimiento, nroEmpleado);
//            docente.setDepartamento(departamento);
//            return docente;
//        }
    }
}
