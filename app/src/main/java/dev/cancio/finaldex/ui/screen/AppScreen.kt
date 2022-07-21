@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import dev.cancio.finaldex.navigation.MainNavigation
import dev.cancio.finaldex.repository.PokemonRepository
import dev.cancio.finaldex.ui.components.PokeBar
import dev.cancio.finaldex.ui.components.PokeHeader
import dev.cancio.finaldex.navigation.PokedexRoutes.MainRoute.itemList
import dev.cancio.finaldex.ui.theme.FinaldexTheme
import dev.cancio.finaldex.viewmodel.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen(
    viewModel: MainViewModel
) {
    FinaldexTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val navController = rememberNavController()
            Scaffold(
                topBar = { PokeHeader()},
                bottomBar = { PokeBar(navController, itemList) }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it),
                    contentAlignment = Alignment.Center,
                ) {
                    MainNavigation(navController,viewModel)
                }
            }
        }
    }
}