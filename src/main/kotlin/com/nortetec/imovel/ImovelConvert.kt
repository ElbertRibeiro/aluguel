package com.nortetec.imovel

fun Imovel.toImovelDto() = ImovelDto(
    endereco, valorAluguel
)

fun ImovelDto.toImovel() = Imovel(
    endereco, valorAluguel
)