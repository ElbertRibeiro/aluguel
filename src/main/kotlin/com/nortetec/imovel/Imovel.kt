package com.nortetec.imovel

import jakarta.persistence.*
import org.hibernate.Hibernate
import java.util.*

@Entity
data class Imovel(
    val endereco: String,
    val valorAluguel: Double,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, unique = true, nullable = false)
    val id: UUID? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Imovel

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , endereco = $endereco , valorAluguel = $valorAluguel )"
    }
}