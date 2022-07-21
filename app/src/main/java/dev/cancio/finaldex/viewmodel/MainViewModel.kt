package dev.cancio.finaldex.viewmodel

import androidx.lifecycle.ViewModel
import dev.cancio.finaldex.repository.PokemonRepository

class MainViewModel: ViewModel() {
    val repository = PokemonRepository()
}