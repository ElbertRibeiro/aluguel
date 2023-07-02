package com.nortetec.locatario;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocatarioServiceImpl implements LocatarioService {

    private final LocatarioRepository repository;

    public LocatarioServiceImpl(LocatarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Locatario> listaLocatario() {
        return repository.findAll();
    }

}
