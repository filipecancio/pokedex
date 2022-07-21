package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import dev.cancio.finaldex.data.model.Pokemon
import dev.cancio.finaldex.ui.components.ImageWeb

@Composable
fun DetailScreen(pokemon: String) {
    val pokemon = Pokemon()
    var selectedItem by remember { mutableStateOf(false) }
    Box(
        contentAlignment = Alignment.Center
    ){
        Column {
            ImageWeb(url = pokemon.avatarUrl)
            Text(text = pokemon.name)
            Button(
                onClick = { selectedItem = !selectedItem }
            ) {
                if(selectedItem) Icons.Outlined.Star else Icons.Filled.Star
            }
        }
    }
}

fun updateLike(pokemon: Pokemon){

}