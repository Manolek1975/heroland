package com.delek.heroland.data.database.entities


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "advantages")
data class AdvantageEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("id") val id: Int,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("description") val description: String
)
