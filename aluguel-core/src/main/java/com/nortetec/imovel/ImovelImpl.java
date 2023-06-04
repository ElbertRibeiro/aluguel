package com.nortetec.imovel;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;

@Document(collection = "tab_imovel")
public class ImovelImpl implements Serializable, Imovel {
    @Serial
    private static final long serialVersionUID = -5666426053006243716L;
    private String endereco;
    private Double valorAluguel;

    public ImovelImpl(String endereco, Double valorAluguel) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
    }

    public ImovelImpl() {
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public Double getValorAluguel() {
        return valorAluguel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImovelImpl imovelImpl = (ImovelImpl) o;

        if (!endereco.equals(imovelImpl.endereco)) return false;
        return valorAluguel.equals(imovelImpl.valorAluguel);
    }

    @Override
    public int hashCode() {
        int result = endereco.hashCode();
        result = 31 * result + valorAluguel.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ImovelImpl{" +
                "endereco='" + endereco + '\'' +
                ", valorAluguel=" + valorAluguel +
                '}';
    }
}
