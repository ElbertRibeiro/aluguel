package com.nortetec.locatario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("locatario")
public class LocatarioController {
    private final LocatarioService service;

    public LocatarioController(LocatarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Locatario> listarLocatario() {
        return service.listaLocatario();
    }
}