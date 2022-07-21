package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.sharp.AddCircle
import androidx.compose.material.icons.sharp.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.cancio.finaldex.data.model.LikeType
import dev.cancio.finaldex.data.model.Pokemon
import dev.cancio.finaldex.repository.PokemonRepository
import dev.cancio.finaldex.ui.components.ImageWeb
import dev.cancio.finaldex.ui.components.PokeValues
import dev.cancio.finaldex.viewmodel.MainViewModel

@Composable
fun DetailScreen(pokemonId: String,viewModel: MainViewModel) {
    val pokemon = viewModel.getPokemon(pokemonId)

    var likedItem by remember { mutableStateOf(pokemon.like) }
    var iconItem by remember { mutableStateOf(pokemon.likeIcon) }

    Box(
        contentAlignment = Alignment.Center
    ){
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            ImageWeb(url = pokemon.avatarUrl)
            Text(text = pokemon.name)
            SmallFloatingActionButton(
                onClick = {
                    val likeType = viewModel.updatePokemon(pokemonId)
                    likedItem = likeType
                    iconItem = pokemon.likeIcon
                },
            ) {
                Icon(iconItem, contentDescription = "Localized description")
            }
            PokeValues("Força")
            PokeValues("Velocidade")
            PokeValues("Habilidade")
            PokeValues("Dano")
        }
    }
}

fun getIcon(likeType: LikeType) = if (likeType == LikeType.Like) Icons.Outlined.Check else Icons.Outlined.Star