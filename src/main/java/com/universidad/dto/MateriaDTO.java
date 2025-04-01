package com.universidad.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class MateriaDTO {
    private Long id;
    private String nombreMateria;
    private String codigoUnico;
    private Integer creditos;

    public MateriaDTO(Long id, String nombreMateria, String codigoUnico, Integer creditos) {
        this.id = id;
        this.nombreMateria = nombreMateria;
        this.codigoUnico = codigoUnico;
        this.creditos = creditos;
    }

    public static MateriaDTO.MateriaDTOBuilder builder() {
        return new MateriaDTO.MateriaDTOBuilder();
    }

    public MateriaDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public static class MateriaDTOBuilder {
        private Long id;
        private String nombreMateria;
        private String codigoUnico;
        private Integer creditos;

        public MateriaDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public MateriaDTOBuilder nombreMateria(String nombreMateria) {
            this.nombreMateria = nombreMateria;
            return this;
        }

        public MateriaDTOBuilder codigoUnico(String codigoUnico) {
            this.codigoUnico = codigoUnico;
            return this;
        }

        public MateriaDTOBuilder creditos(Integer creditos) {
            this.creditos = creditos;
            return this;
        }

        public MateriaDTO build() {
            return new MateriaDTO(id, nombreMateria, codigoUnico, creditos);
        }
    }


}