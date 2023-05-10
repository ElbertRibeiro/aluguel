package com.nortetec.locacao

import com.nortetec.imovel.Imovel
import com.nortetec.locatario.Locatario
import jakarta.persistence.*
import org.hibernate.Hibernate
import java.time.LocalDate
import java.util.*

@Entity
data class Locacao(
    val dataInicio: LocalDate,
    val dataFim: LocalDate,
    @ManyToOne
    @JoinColumn(name = "locatario_id")
    val locatario: Locatario,
    @ManyToOne
    @JoinColumn(name = "imovel_id")
    val imovel: Imovel
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, unique = true, nullable = false)
    val id: UUID? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Locacao

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , dataInicio = $dataInicio , dataFim = $dataFim , locatario = $locatario , imovel = $imovel )"
    }
}
