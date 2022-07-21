package dev.cancio.finaldex.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import dev.cancio.finaldex.data.model.LikeType
import dev.cancio.finaldex.data.model.Pokemon
import dev.cancio.finaldex.repository.PokemonRepository

class MainViewModel : ViewModel() {
    private val repository = PokemonRepository()

    fun getPokemonOnHome(): MutableList<Pokemon> = repository.getAllPokemon()
    fun getPokemonOnDetail(): MutableList<Pokemon> = repository.getLikePokemon()
    fun getPokemon(pokemonId: String): Pokemon = repository.getPokemonDetail(pokemonId)

    fun goToDetail(navController: NavController, id: String) {
        navController.navigate("detail/${id}")
    }

    fun updatePokemon(pokemonId: String): LikeType{
        return repository.updatePokemon(pokemonId)
    }

}