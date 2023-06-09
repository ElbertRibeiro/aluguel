package com.nortetec.locador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("locador")
public class LocadorController {
    private final LocadorService service;

    public LocadorController(LocadorService service) {
        this.service = service;
    }

    @GetMapping
    public String hello() {
        return service.hello();
    }
}
