package com.nortetec.imovel

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("imovel")
public class ImovelController(val service: ImovelService) {
    @GetMapping
    fun listaImoveis(): List<Imovel> {
        return service.listaImovel()
    }
}