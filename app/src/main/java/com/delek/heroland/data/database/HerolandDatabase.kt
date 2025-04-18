package com.delek.heroland.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.delek.heroland.data.database.dao.AdvantageDao
import com.delek.heroland.data.database.dao.ArmorDao
import com.delek.heroland.data.database.dao.ChitDao
import com.delek.heroland.data.database.dao.DwellingDao
import com.delek.heroland.data.database.dao.RoleAdvantageDao
import com.delek.heroland.data.database.dao.RoleArmorDao
import com.delek.heroland.data.database.dao.RoleChitDao
import com.delek.heroland.data.database.dao.RoleDao
import com.delek.heroland.data.database.dao.RoleDwellingDao
import com.delek.heroland.data.database.dao.RoleWeaponDao
import com.delek.heroland.data.database.dao.StartSpellDao
import com.delek.heroland.data.database.dao.WeaponDao
import com.delek.heroland.data.database.entities.AdvantageEntity
import com.delek.heroland.data.database.entities.ArmorEntity
import com.delek.heroland.data.database.entities.ChitEntity
import com.delek.heroland.data.database.entities.DwellingEntity
import com.delek.heroland.data.database.entities.RoleAdvantageEntity
import com.delek.heroland.data.database.entities.RoleArmorEntity
import com.delek.heroland.data.database.entities.RoleChitEntity
import com.delek.heroland.data.database.entities.RoleDwellingEntity
import com.delek.heroland.data.database.entities.RoleEntity
import com.delek.heroland.data.database.entities.RoleWeaponEntity
import com.delek.heroland.data.database.entities.StartSpellEntity
import com.delek.heroland.data.database.entities.WeaponEntity

@Database(
    entities = [
        RoleEntity::class,
        AdvantageEntity::class,
        ChitEntity::class,
        DwellingEntity::class,
        WeaponEntity::class,
        ArmorEntity::class,
        RoleAdvantageEntity::class,
        RoleChitEntity::class,
        RoleDwellingEntity::class,
        RoleWeaponEntity::class,
        RoleArmorEntity::class,
        StartSpellEntity::class],
    version = 1,
    exportSchema = true
)
abstract class HerolandDatabase : RoomDatabase() {
    abstract fun getRoleDao(): RoleDao
    abstract fun getDwellingDao(): DwellingDao
    abstract fun getAdvantageDao(): AdvantageDao
    abstract fun getRoleAdvantageDao(): RoleAdvantageDao
    abstract fun getChitDao(): ChitDao
    abstract fun getRoleChitDao(): RoleChitDao
    abstract fun getRoleDwellingDao(): RoleDwellingDao
    abstract fun getWeaponDao(): WeaponDao
    abstract fun getRoleWeaponDao(): RoleWeaponDao
    abstract fun getArmorDao(): ArmorDao
    abstract fun getRoleArmorDao(): RoleArmorDao
    abstract fun getStartSpellDao(): StartSpellDao
}
