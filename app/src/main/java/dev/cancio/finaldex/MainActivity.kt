package dev.cancio.finaldex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.cancio.finaldex.repository.PokemonRepository
import dev.cancio.finaldex.ui.screen.HomeScreen
import dev.cancio.finaldex.ui.theme.FinaldexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val repository = PokemonRepository()
            AppScreen(repository)
        }
    }
}

@Composable
fun AppScreen(repository: PokemonRepository) {
    FinaldexTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            HomeScreen(repository)
        }
    }
}