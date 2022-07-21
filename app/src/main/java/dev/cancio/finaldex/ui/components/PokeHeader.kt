package dev.cancio.finaldex.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun PokeHeader() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Pokedex",
            )
        },
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = "Localized description",
                )
            }
        },
    )
}
