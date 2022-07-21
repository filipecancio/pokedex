package dev.cancio.finaldex.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import dev.cancio.finaldex.data.model.Pokemon
import dev.cancio.finaldex.repository.PokemonRepository

class MainViewModel : ViewModel() {
    private val repository = PokemonRepository()

    fun getPokemonOnHome(): MutableList<Pokemon> = repository.getAllPokemon()
    fun getPokemon(pokemonId: String): Pokemon = repository.getPokemonDetail(pokemonId)

    fun goToDetail(navController: NavController, id: String) {
        navController.navigate("detail/${id}")
    }

    fun updatePokemon(pokemonId: String){
        repository.updatePokemon(pokemonId)
    }

}