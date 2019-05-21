package com.example.SpringBackend.Interfaces;

import com.example.SpringBackend.Entities.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> getAll();
    Persona getOne(Integer id);
    Persona add(Persona persona);
    Persona edit(Persona persona);
    void delete(Integer id);
}
