package com.nortetec.locacao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface LocacaoRepository : JpaRepository<Locacao, UUID>