package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import dev.cancio.finaldex.repository.PokemonRepository
import dev.cancio.finaldex.ui.components.PokeItem
import dev.cancio.finaldex.viewmodel.MainViewModel

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: MainViewModel
) {
    LazyColumn {
        items(
            items = viewModel.getPokemonOnHome(),
            itemContent = { PokeItem(it) { viewModel.goToDetail(navController,it.id.toString()) }}
        )
    }
}