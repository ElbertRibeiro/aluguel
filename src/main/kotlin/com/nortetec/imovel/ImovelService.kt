package com.nortetec.imovel

interface ImovelService {
    fun listaImovel(): List<Imovel>
    fun salvarImovel(imovel: Imovel): String
}