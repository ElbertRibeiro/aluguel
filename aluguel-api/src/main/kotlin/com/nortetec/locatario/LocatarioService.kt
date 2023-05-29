package com.nortetec.locatario

interface LocatarioService {
    fun hello(): String

    fun listaLocatario(): List<Locatario>
}