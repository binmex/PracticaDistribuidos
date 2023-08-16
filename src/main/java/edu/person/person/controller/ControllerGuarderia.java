package edu.person.person.controller;

import edu.person.person.models.Guarderia;
import edu.person.person.services.ServiceGuarderia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/guarderia")
public class ControllerGuarderia {
    @Autowired
    ServiceGuarderia serviceGuarderia;

    @GetMapping("/selectall")
    public List<Guarderia> selectAll(){
        return serviceGuarderia.allInfo();
    }

    @PostMapping("/save")
    public Guarderia saveGuarderia(@RequestBody Guarderia guarderia){
        return serviceGuarderia.saverGuarderia(guarderia);
    }
}
