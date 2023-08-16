package edu.person.person.services;

import edu.person.person.models.Guarderia;
import edu.person.person.repositories.IARepositoryGuarderia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceGuarderia {
    @Autowired
    private IARepositoryGuarderia iaRepositoryGuarderia;

    public List<Guarderia> allInfo(){
        return iaRepositoryGuarderia.selectAllInfo4();
    }

    public Guarderia saverGuarderia(Guarderia guarderia){
        iaRepositoryGuarderia.save(guarderia);
        return guarderia;
    }

}
