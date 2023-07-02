package com.nortetec.locacao;

import com.nortetec.imovel.Imovel;
import com.nortetec.locatario.Locatario;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Document(collection = "tab_locacao")
public class Locacao {
    private UUID id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    @DBRef
    private Locatario locatario;
    @DBRef
    private Imovel imovel;

    public Locacao() {
    }

    public Locacao(UUID id, LocalDate dataInicio, LocalDate dataFim, Locatario locatario, Imovel imovel) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.locatario = locatario;
        this.imovel = imovel;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Locacao locacao = (Locacao) o;

        if (!Objects.equals(id, locacao.id)) return false;
        if (!Objects.equals(dataInicio, locacao.dataInicio)) return false;
        if (!Objects.equals(dataFim, locacao.dataFim)) return false;
        if (!Objects.equals(locatario, locacao.locatario)) return false;
        return Objects.equals(imovel, locacao.imovel);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dataInicio != null ? dataInicio.hashCode() : 0);
        result = 31 * result + (dataFim != null ? dataFim.hashCode() : 0);
        result = 31 * result + (locatario != null ? locatario.hashCode() : 0);
        result = 31 * result + (imovel != null ? imovel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", locatario=" + locatario +
                ", imovel=" + imovel +
                '}';
    }
}
