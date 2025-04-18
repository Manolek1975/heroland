package com.delek.heroland.data.repository

import com.delek.heroland.data.database.dao.RoleDao
import com.delek.heroland.data.database.entities.RoleEntity
import com.delek.heroland.domain.model.Role
import com.delek.heroland.domain.model.toDomain
import javax.inject.Inject

class RoleRepository @Inject constructor(private val roleDao: RoleDao) {

    suspend fun insertRoles(roles: List<RoleEntity>) {
        roleDao.insertRoles(roles)
    }

    suspend fun getAllRoles(): List<Role> {
        val response: List<RoleEntity> = roleDao.getAllRoles()
        return response.map { it.toDomain() }
    }

    suspend fun getRoleById(id: Int): Role {
        val response: RoleEntity = roleDao.getRoleById(id)
        return response.toDomain()
    }

    suspend fun countStartSpells(id: Int): Int {
        return roleDao.countStartSpells(id)
    }

    suspend fun clearRoles() {
        roleDao.deleteAllRoles()
    }

}