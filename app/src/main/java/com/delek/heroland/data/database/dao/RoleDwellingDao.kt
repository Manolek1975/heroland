package com.delek.heroland.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.delek.heroland.data.database.entities.DwellingEntity
import com.delek.heroland.data.database.entities.RoleDwellingEntity

@Dao
interface RoleDwellingDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertRoleDwellings(roleDwelling: List<RoleDwellingEntity>)

    @Query("SELECT * FROM role_dwellings")
    suspend fun getAllRoleDwellings(): List<RoleDwellingEntity>

    @Query("SELECT * FROM dwellings INNER JOIN role_dwellings " +
            "ON dwellings.id = role_dwellings.dwelling_id " +
            "WHERE role_dwellings.role_id = :id")
    suspend fun getDwellingsByRole(id: Int): List<DwellingEntity>
}