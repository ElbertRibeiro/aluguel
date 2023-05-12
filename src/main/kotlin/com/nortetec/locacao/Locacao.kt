package com.nortetec.locacao

import com.nortetec.imovel.Imovel
import com.nortetec.locatario.Locatario
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.util.*

@Document
data class Locacao(
    val dataInicio: LocalDate,
    val dataFim: LocalDate,
    @DBRef
    val locatario: Locatario,
    @DBRef
    val imovel: Imovel
) {
    @Id
    val id: UUID? = null
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Locacao

        if (dataInicio != other.dataInicio) return false
        if (dataFim != other.dataFim) return false
        if (locatario != other.locatario) return false
        if (imovel != other.imovel) return false
        return id == other.id
    }

    override fun hashCode(): Int {
        var result = dataInicio.hashCode()
        result = 31 * result + dataFim.hashCode()
        result = 31 * result + locatario.hashCode()
        result = 31 * result + imovel.hashCode()
        result = 31 * result + (id?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Locacao(dataInicio=$dataInicio, dataFim=$dataFim, locatario=$locatario, imovel=$imovel, id=$id)"
    }
}
