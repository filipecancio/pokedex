package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import dev.cancio.finaldex.repository.PokemonRepository
import dev.cancio.finaldex.ui.components.PokeItem

@Composable
fun HomeScreen(
    repository: PokemonRepository
) {
    LazyColumn {
        items(
            items = repository.getPokemonList(),
            itemContent = { PokeItem(it)}
        )
    }
}