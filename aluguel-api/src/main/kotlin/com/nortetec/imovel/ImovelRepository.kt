package com.nortetec.imovel

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ImovelRepository : MongoRepository<Imovel, String>