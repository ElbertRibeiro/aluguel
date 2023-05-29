package com.nortetec.locatario

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface LocatarioRepository : MongoRepository<Locatario, UUID>