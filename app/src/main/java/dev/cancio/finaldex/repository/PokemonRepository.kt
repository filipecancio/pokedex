package dev.cancio.finaldex.repository

import dev.cancio.finaldex.data.model.LikeType
import dev.cancio.finaldex.data.model.Pokemon

class PokemonRepository {
    private val pokemonList = mutableListOf(
        Pokemon(1, "bulbasaur"),
        Pokemon(2, "ivysaur"),
        Pokemon(3, "venusaur"),
        Pokemon(4, "charmander"),
        Pokemon(5, "charmeleon"),
        Pokemon(6, "charizard",LikeType.Like),
        Pokemon(7, "squirtle"),
        Pokemon(8, "wartortle"),
        Pokemon(9, "blastoise"),
        Pokemon(10, "caterpie"),
        Pokemon(11, "metapod"),
        Pokemon(12, "butterfree"),
        Pokemon(13, "weedle"),
        Pokemon(14, "kakuna"),
        Pokemon(15, "beedrill"),
        Pokemon(16, "pidgey"),
        Pokemon(17, "pidgeotto"),
        Pokemon(18, "pidgeot"),
        Pokemon(19, "rattata"),
        Pokemon(20, "raticate"),
        Pokemon(21, "spearow"),
        Pokemon(22, "fearow"),
        Pokemon(23, "ekans"),
        Pokemon(24, "arbok"),
        Pokemon(25, "pikachu"),
        Pokemon(26, "raichu"),
        Pokemon(27, "sandshrew"),
        Pokemon(28, "sandslash"),
        Pokemon(29, "nidoran-f"),
        Pokemon(30, "nidorina")
    )

    fun updatePokemon(pokemonId: String): LikeType  {
        pokemonList.forEach {
            if (it.id == pokemonId.toInt()) {
                it.like = if (it.like == LikeType.Like) LikeType.Unlike else LikeType.Like
                return it.like
            }
        }
        return LikeType.Unlike
    }

    fun getAllPokemon(): MutableList<Pokemon> {
        return pokemonList
    }

    fun getLikePokemon(): MutableList<Pokemon> {
        return pokemonList.filter{ it.like == LikeType.Like }.toMutableList()
    }

    fun getPokemonDetail(pokemonId: String): Pokemon {
        return pokemonList.filter { it.id == pokemonId.toInt() }[0]
    }
}