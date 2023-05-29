package com.nortetec.locatario

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LocatarioResolver(val service: LocatarioService) {

    @QueryMapping
    fun hello(): String {
        return service.hello()
    }

    @QueryMapping
    fun listarLocatario(): List<LocatarioDto> {
        return service.listaLocatario().map { locatario -> locatario.toLocatarioDto() }
    }
}