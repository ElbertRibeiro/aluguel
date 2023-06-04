package com.nortetec.imovel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends MongoRepository<ImovelImpl, String> {
}
