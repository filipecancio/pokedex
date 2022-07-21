package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(
            items = viewModel.getPokemonOnHome(),
            itemContent = { PokeItem(it) { viewModel.goToDetail(navController,it.id.toString()) }}
        )
    }
}