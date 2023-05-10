package com.nortetec.locatario

import org.springframework.stereotype.Service

@Service
class LocatarioServiceImpl(val repository: LocatarioRepository) : LocatarioService {
    override fun hello(): String {
        return "hello service"
    }

    override fun listaLocatario(): List<Locatario> {
        return repository.findAll()
    }
}