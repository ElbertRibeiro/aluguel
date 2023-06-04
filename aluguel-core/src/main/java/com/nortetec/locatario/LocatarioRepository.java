package com.nortetec.locatario;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LocatarioRepository extends MongoRepository<Locatario, UUID > {
}
