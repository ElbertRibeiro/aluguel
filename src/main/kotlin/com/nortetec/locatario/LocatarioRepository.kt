package com.nortetec.locatario

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface LocatarioRepository : JpaRepository<Locatario, UUID>