package com.nortetec.locacao

import org.springframework.stereotype.Service

@Service
class LocacaoServiceImpl(val repository: LocacaoRepository): LocacaoService {
    override fun listaLocacao(): List<Locacao> {
        return repository.findAll()
    }
}