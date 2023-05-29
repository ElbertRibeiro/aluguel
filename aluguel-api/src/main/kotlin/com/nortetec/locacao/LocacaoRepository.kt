package com.nortetec.locacao

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface LocacaoRepository : MongoRepository<Locacao, UUID>