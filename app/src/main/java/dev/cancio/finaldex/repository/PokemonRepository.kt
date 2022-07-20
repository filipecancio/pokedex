package dev.cancio.finaldex.repository

import dev.cancio.finaldex.data.model.Pokemon

class PokemonRepository {
    fun getPokemonList(): MutableList<Pokemon> {
        return mutableListOf<Pokemon>(
            Pokemon("Pikachu"),
            Pokemon("Bubassaur"),
            Pokemon(),
            Pokemon(),
            Pokemon(),
            Pokemon(),
            Pokemon(),
            Pokemon(),
            Pokemon(),
            Pokemon(),
            Pokemon(),
            Pokemon(),
            Pokemon(),
        )
    }
}