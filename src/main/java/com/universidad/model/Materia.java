package com.universidad.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class Materia {

    private Long id;
    private String nombreMateria;
    private String codigoUnico;
    private Integer creditos;

    public Materia(){}

    public Materia(Long id, String nombreMateria, String codigoUnico, Integer creditos) {
        this.id = id;
        this.nombreMateria = nombreMateria;
        this.codigoUnico = codigoUnico;
        this.creditos = creditos;
    }

    public Long getId() {
        return id;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public static MateriaBuilder builder() {
        return new MateriaBuilder();
    }

    public static class MateriaBuilder {
        private Long id;
        private String nombreMateria;
        private String codigoUnico;
        private Integer creditos;

        public MateriaBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public MateriaBuilder nombreMateria(String nombreMateria) {
            this.nombreMateria = nombreMateria;
            return this;
        }

        public MateriaBuilder codigoUnico(String codigoUnico) {
            this.codigoUnico = codigoUnico;
            return this;
        }

        public MateriaBuilder creditos(Integer creditos) {
            this.creditos = creditos;
            return this;
        }

        public Materia build() {
            return new Materia(id, nombreMateria, codigoUnico, creditos);
        }
    }
}