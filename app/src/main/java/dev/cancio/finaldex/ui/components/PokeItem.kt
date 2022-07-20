package dev.cancio.finaldex.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.cancio.finaldex.data.model.Pokemon

@Composable
fun PokeItem(pokemon: Pokemon) {
    Text(text = "Pokemon: ${pokemon.name}!")
}