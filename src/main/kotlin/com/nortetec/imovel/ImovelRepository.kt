package com.nortetec.imovel

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ImovelRepository : MongoRepository<Imovel, UUID>