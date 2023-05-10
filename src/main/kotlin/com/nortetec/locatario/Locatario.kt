package com.nortetec.locatario

import jakarta.persistence.*
import org.hibernate.Hibernate
import java.util.*

@Entity
data class Locatario(
    val nome: String,
    val email: String,
    val telefone: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, unique = true, nullable = false)
    val id: UUID? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Locatario

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , nome = $nome , email = $email , telefone = $telefone )"
    }

}