package com.nortetec.imovel

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Imovel(
    val endereco: String,
    val valorAluguel: Double,
) {
    @Id
    val id: UUID? = null
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Imovel

        if (endereco != other.endereco) return false
        if (valorAluguel != other.valorAluguel) return false
        return id == other.id
    }

    override fun hashCode(): Int {
        var result = endereco.hashCode()
        result = 31 * result + valorAluguel.hashCode()
        result = 31 * result + (id?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Imovel(endereco='$endereco', valorAluguel=$valorAluguel, id=$id)"
    }
}