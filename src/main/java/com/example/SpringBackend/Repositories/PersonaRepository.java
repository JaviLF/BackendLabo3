package com.example.SpringBackend.Repositories;

import com.example.SpringBackend.Entities.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends CrudRepository <Persona, Integer> {

    List<Persona> findAll();

    Persona findOne(Integer id);

    Persona save(Persona persona);

    void delete(Integer id);
}
