package edu.person.person.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DTOPerro implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("apellido")
    private String apellido;

    public DTOPerro() {
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
}
