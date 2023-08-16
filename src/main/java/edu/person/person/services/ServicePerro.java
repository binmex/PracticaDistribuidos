package edu.person.person.services;

import edu.person.person.DTOs.DTOPerro;
import edu.person.person.models.Perro;
import edu.person.person.repositories.IARepositoryPerro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServicePerro {
    @Autowired
    private IARepositoryPerro iaRepositoryPerro;

    public List<Perro> getPerro(){
        return iaRepositoryPerro.selectAllInfo();
    }

    public List<Perro> getPerroJPA(){
        return iaRepositoryPerro.findAll();
    }

    public List<DTOPerro> listPerroDTO(){
        List<Perro> allPerros = iaRepositoryPerro.findAll();
        List<DTOPerro> dtoPerros = new ArrayList<>();
        for (Perro per: allPerros) {
            dtoPerros.add(per.toDTO());
        }
        return dtoPerros;
    }
    public Perro savePerro(Perro perro){
        iaRepositoryPerro.save(perro);
        return perro;
    }

    public Perro getPerro(Long idPerro){
        return iaRepositoryPerro.findByIDPerro(idPerro);
    }

}
