package dev.cancio.finaldex.data.model

data class Pokemon(
    val id: Int = 0,
    val name: String = "who that's pokemon",
    var like: Boolean = false
) {
    val avatarUrl: String
        get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/${id}.png"
}