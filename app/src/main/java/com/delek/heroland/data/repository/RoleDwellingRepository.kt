package com.delek.heroland.data.repository

import com.delek.heroland.data.database.dao.RoleDwellingDao
import com.delek.heroland.data.database.entities.RoleDwellingEntity
import com.delek.heroland.domain.model.RoleDwelling
import com.delek.heroland.domain.model.toDomain
import javax.inject.Inject

class RoleDwellingRepository @Inject constructor(private val roleDwellingDao: RoleDwellingDao) {

    suspend fun insertRoleDwellings(roleDwellings: List<RoleDwellingEntity>) {
        roleDwellingDao.insertRoleDwellings(roleDwellings)
    }

    suspend fun getAllRoleDwellings(): List<RoleDwelling> {
        val response: List<RoleDwellingEntity> = roleDwellingDao.getAllRoleDwellings()
        return response.map { it.toDomain() }
    }

}