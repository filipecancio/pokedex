package dev.cancio.finaldex.ui.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import dev.cancio.finaldex.repository.PokemonRepository
import dev.cancio.finaldex.ui.components.PokeItem

@Composable
fun HomeScreen(navController: NavHostController) {
    val repository = PokemonRepository()
    LazyColumn {
        items(
            items = repository.getPokemonList(),
            itemContent = { PokeItem(it) { aaa(navController,it.toString()) }}
        )
    }
}

fun aaa(navController: NavController,id:String){
    navController.navigate("detail/${id}")
}