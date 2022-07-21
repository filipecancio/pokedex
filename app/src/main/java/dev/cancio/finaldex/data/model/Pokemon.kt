package dev.cancio.finaldex.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Star
import androidx.compose.ui.graphics.vector.ImageVector

data class Pokemon(
    val id: Int = 0,
    val name: String = "who that's pokemon",
    var like: LikeType = LikeType.Unlike
) {
    val avatarUrl: String
        get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/${id}.png"

    val likeIcon: ImageVector
        get() = if (like == LikeType.Like) Icons.Outlined.Favorite else Icons.Outlined.FavoriteBorder
}

sealed class LikeType {
    object Like : LikeType()
    object Unlike : LikeType()
}