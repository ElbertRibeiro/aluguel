package com.nortetec.imovel;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelServiceImpl implements ImovelService {
    private final ImovelRepository repository;

    public ImovelServiceImpl(ImovelRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ImovelImpl> listaImovel() {
        return repository.findAll();
    }
}
