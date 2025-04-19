package com.delek.heroland.data.repository

import com.delek.heroland.data.database.dao.RoleWeaponDao
import com.delek.heroland.data.database.entities.RoleWeaponEntity
import com.delek.heroland.data.database.entities.WeaponEntity
import com.delek.heroland.domain.model.RoleWeapon
import com.delek.heroland.domain.model.Weapon
import com.delek.heroland.domain.model.toDomain
import javax.inject.Inject

class RoleWeaponRepository @Inject constructor(private val roleWeaponDao: RoleWeaponDao) {

    suspend fun insertRoleWeapons(roleWeapons: List<RoleWeaponEntity>) {
        roleWeaponDao.insertRoleWeapons(roleWeapons)
    }

    suspend fun getAllRoleWeapons(): List<RoleWeapon> {
        val response: List<RoleWeaponEntity> = roleWeaponDao.getAllRoleWeapons()
        return response.map { it.toDomain() }
    }

    suspend fun getWeaponsByRole(id: Int): List<Weapon> {
        val response: List<WeaponEntity> = roleWeaponDao.getWeaponsByRole(id)
        return response.map { it.toDomain() }

    }
}