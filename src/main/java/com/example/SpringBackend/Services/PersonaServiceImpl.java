package com.example.SpringBackend.Services;

import com.example.SpringBackend.Entities.Persona;
import com.example.SpringBackend.Interfaces.PersonaService;
import com.example.SpringBackend.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona getOne(Integer id) {
        return personaRepository.findOne(id);
    }

    @Override
    public Persona add(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona edit(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void delete(Integer id) {
        personaRepository.delete(id);
    }
}
