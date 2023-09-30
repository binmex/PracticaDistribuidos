package edu.person.person.models;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "GUARDERIA")
public class Guarderia implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="IDGUARDERIA")
    private Long id;
    @Column(name = "NAMEG")
    private String nameGuarderi;

    @ManyToOne
    @JoinColumn(name = "FK_PERRO")
    private Perro perro;

    public Guarderia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameGuarderi() {
        return nameGuarderi;
    }

    public void setNameGuarderi(String nameGuarderi) {
        this.nameGuarderi = nameGuarderi;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
