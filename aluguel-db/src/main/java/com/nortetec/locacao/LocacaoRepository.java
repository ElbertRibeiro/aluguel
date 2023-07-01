package com.nortetec.locacao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LocacaoRepository extends MongoRepository<Locacao, UUID> {
}
