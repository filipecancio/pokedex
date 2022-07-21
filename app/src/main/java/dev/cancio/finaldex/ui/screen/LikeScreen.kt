package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import dev.cancio.finaldex.ui.components.PokeItem
import dev.cancio.finaldex.viewmodel.MainViewModel

@Composable
fun LikeScreen(
    navController: NavHostController,
    viewModel: MainViewModel
) {
    LazyColumn {
        items(
            items = viewModel.getPokemonOnDetail(),
            itemContent = { PokeItem(it) { viewModel.goToDetail(navController,it.id.toString()) } }
        )
    }
}