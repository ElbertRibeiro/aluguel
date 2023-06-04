package com.nortetec.locatario;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocatarioService implements LocatarioOperations {

    private final LocatarioRepository repository;

    public LocatarioService(LocatarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Locatario> listaLocatario() {
        return repository.findAll();
    }
}
