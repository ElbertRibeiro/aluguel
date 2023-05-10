package com.nortetec.locatario

fun Locatario.toLocatarioDto() = LocatarioDto(
    nome, email, telefone
)