package dev.cancio.finaldex.data.model

data class Pokemon(
    val id: Int = 0,
    val name: String = "who that's pokemon",
    var like: LikeType = LikeType.Unlike
) {
    val avatarUrl: String
        get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/${id}.png"
}

sealed class LikeType {
    object Like : LikeType()
    object Unlike : LikeType()
}