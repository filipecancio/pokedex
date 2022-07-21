package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dev.cancio.finaldex.ui.components.PokeItem
import dev.cancio.finaldex.viewmodel.MainViewModel

@Composable
fun LikeScreen(
    navController: NavHostController,
    viewModel: MainViewModel
) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(
            items = viewModel.getPokemonOnDetail(),
            itemContent = { PokeItem(it) { viewModel.goToDetail(navController,it.id.toString()) } }
        )
    }
}