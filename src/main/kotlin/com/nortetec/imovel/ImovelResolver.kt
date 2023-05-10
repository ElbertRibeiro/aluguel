package com.nortetec.imovel

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ImovelResolver(val service: ImovelService) {
    @QueryMapping
    fun listaImoveis(): List<ImovelDto> {
        return service.listaImovel().map { imovel -> imovel.toImovelDto() }
    }

    @MutationMapping
    fun salvaImoveis(@Argument imovel: ImovelDto): String {
        return service.salvarImovel(imovel.toImovel())
    }
}