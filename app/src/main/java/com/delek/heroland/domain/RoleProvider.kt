package com.delek.heroland.domain

import com.delek.heroland.data.database.entities.RoleEntity


class RoleProvider {
    companion object {
        val roles = listOf(
            RoleEntity(
                1, "Amazon", "", "", "", "img_amazon", "",
                "Medium", 0, 0, 0, 0, 0, ""
            ),
            RoleEntity(
                2, "Berserker", "", "", "", "img_berserker", "",
                "Heavy", 0, 0, 0, 0, 0, ""
            )
        )
    }
}