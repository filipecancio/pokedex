@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.finaldex.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.cancio.finaldex.data.model.Pokemon
import dev.cancio.finaldex.ui.screen.DetailScreen

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PokeItem(pokemon: Pokemon, callback: ()->Unit) {
    val navController = rememberNavController()

    ListItem(
        text = { Text(text = pokemon.name) },
        icon = {
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .background(
                        shape = RoundedCornerShape(30.dp),
                        color = Color.White
                    )
                    .padding(5.dp)
                    .clickable(onClick = { callback() })
            ) {
                ImageWeb(
                    url = pokemon.avatarUrl,
                    modifier = Modifier.size(40.dp)
                )
            }
        }
    )
}