package edu.person.person.controller;

import edu.person.person.DTOs.DTOPerro;
import edu.person.person.models.Perro;
import edu.person.person.services.ServicePerro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/testeo")
public class ControllerPerro {
    @Autowired
    private ServicePerro servicePerro;

    @GetMapping("/listado")
    public List<Perro> getPerros(){
        return servicePerro.getPerro();
    }
    @GetMapping("/listjpa")
    public List<Perro> getPerroJPA(){
        return servicePerro.getPerroJPA();
    }

    @GetMapping("/listDTO")
    public List<DTOPerro> getPerrosDto(){
        return servicePerro.listPerroDTO();
    }

    @PostMapping("/savePerro")
    public Perro savePerro(@RequestBody Perro perro){
        return servicePerro.savePerro(perro);
    }

    @GetMapping("/getPerro/{idPerro}")
    public Perro getPerro(@PathVariable Long idPerro){
        return servicePerro.getPerro(idPerro);
    }

}
