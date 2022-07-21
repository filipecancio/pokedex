package dev.cancio.finaldex.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import dev.cancio.finaldex.ui.screen.DetailScreen
import dev.cancio.finaldex.ui.screen.HomeScreen
import dev.cancio.finaldex.ui.screen.LikeScreen

@Composable
fun MainNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home")  {  HomeScreen(navController) }
        composable("Likes")  {  LikeScreen(navController) }
        composable(
            "Detail/{pokemonId}",
            arguments = listOf(navArgument("pokemonId") { type = NavType.StringType })
        ) { backStackEntry ->
            backStackEntry.arguments?.getString("pokemonId")?.let { DetailScreen(it) }
        }
    }
}

sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val title: String
) {
    object Home : BottomNavItem("home", Icons.Filled.Home, "Home")
    object Likes : BottomNavItem("likes", Icons.Filled.Star, "Likes")
}

sealed class PokedexRoutes(val itemList: List<BottomNavItem>){
    object MainRoute: PokedexRoutes(listOf(BottomNavItem.Home, BottomNavItem.Likes))
}