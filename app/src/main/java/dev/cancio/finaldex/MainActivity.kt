@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.finaldex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.cancio.finaldex.repository.PokemonRepository
import dev.cancio.finaldex.ui.screen.AppScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val repository = PokemonRepository()
            AppScreen(repository)
        }
    }
}

