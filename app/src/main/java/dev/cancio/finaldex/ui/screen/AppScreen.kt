@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.cancio.finaldex.repository.PokemonRepository
import dev.cancio.finaldex.ui.theme.FinaldexTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen(repository: PokemonRepository) {
    FinaldexTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Scaffold() {
                HomeScreen(repository)
            }
        }
    }
}