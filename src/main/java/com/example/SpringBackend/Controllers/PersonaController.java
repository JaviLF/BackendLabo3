
package com.example.SpringBackend.Controllers;

import com.example.SpringBackend.Entities.Persona;
import com.example.SpringBackend.Interfaces.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    private PersonaService personaService;


    @GetMapping("/personas")
    public List<Persona> Lista(){
        return personaService.getAll();
    }

    @PostMapping("/personas")
    public Persona agregar(@RequestBody Persona persona){
        persona.setId(null);
        return personaService.add(persona);
    }

    @GetMapping(value = "/personas/{id}")
    public Persona getById(@PathVariable("id") Integer id){
        return personaService.getOne(id);
    }

    @PutMapping("/personas/{id}")
    public Persona editar(@PathVariable("id") Integer id,@RequestBody Persona persona){
        persona.setId(id);
        return personaService.edit(persona);
    }

    @DeleteMapping("/personas/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        personaService.delete(id);
    }
}
