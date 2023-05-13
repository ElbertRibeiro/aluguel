package com.nortetec.imovel

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "tab_imovel")
data class Imovel(
    val endereco: String,
    val valorAluguel: Double,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Imovel

        if (endereco != other.endereco) return false
        return valorAluguel == other.valorAluguel
    }

    override fun hashCode(): Int {
        var result = endereco.hashCode()
        result = 31 * result + valorAluguel.hashCode()
        return result
    }

    override fun toString(): String {
        return "Imovel(endereco='$endereco', valorAluguel=$valorAluguel)"
    }
}