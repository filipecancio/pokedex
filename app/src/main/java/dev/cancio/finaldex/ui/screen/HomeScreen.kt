package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.cancio.finaldex.repository.PokemonRepository

@Composable
fun HomeScreen(
    repository: PokemonRepository
) {
    Column {
        repository.getPokemonList().map {
            Text(text = "Pokemon: ${it.name}!")
        }
    }
}