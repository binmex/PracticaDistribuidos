package edu.person.person.models;

import edu.person.person.DTOs.DTOPerro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PERRO")
public class Perro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDPERRO")
    private Long idPerro;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "APELLIDO")
    private String apellido;

    public Long getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(Long idPerro) {
        this.idPerro = idPerro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DTOPerro toDTO(){
        DTOPerro perroDTO = new DTOPerro();
        perroDTO.setNombre(name);
        perroDTO.setApellido(apellido);
        return perroDTO;
    }
}
