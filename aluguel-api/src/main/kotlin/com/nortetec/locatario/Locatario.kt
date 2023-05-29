package com.nortetec.locatario

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "tab_locarario")
data class Locatario(
    val nome: String,
    val email: String,
    val telefone: String,
) {
    @Id
    val id: UUID? = null
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Locatario

        if (nome != other.nome) return false
        if (email != other.email) return false
        if (telefone != other.telefone) return false
        return id == other.id
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + email.hashCode()
        result = 31 * result + telefone.hashCode()
        result = 31 * result + (id?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Locatario(nome='$nome', email='$email', telefone='$telefone', id=$id)"
    }

}