package com.nortetec.imovel

import org.springframework.stereotype.Service

@Service
class ImovelServiceImpl(val repository: ImovelRepository) : ImovelService {
    override fun listaImovel(): List<Imovel> {
        return repository.findAll()
    }
}