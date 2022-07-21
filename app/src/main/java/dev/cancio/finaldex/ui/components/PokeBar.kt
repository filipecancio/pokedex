package dev.cancio.finaldex.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.NavController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import dev.cancio.finaldex.ui.screen.HomeScreen
import dev.cancio.finaldex.ui.screen.LikeScreen
import dev.cancio.finaldex.ui.components.BottomNavItem.Likes
import dev.cancio.finaldex.ui.components.BottomNavItem.Home

@Composable
fun PokeBar(navController: NavController, itemList: List<BottomNavItem>)  {
    var selectedItem by remember { mutableStateOf(0) }
    NavigationBar(
    ) {
        itemList.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = null) },
                label = { Text(item.title) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.route){
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            )
        }
    }
}

@Composable
fun MainNavigation(navController: NavHostController, itemList: List<BottomNavItem>) {
    NavHost(navController = navController, startDestination = itemList.first().route) {
        itemList.forEach { item -> composable(item.route)  { item.screen.invoke() } }
    }
}

sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val title: String,
    val screen: (@Composable () -> Unit)) {
    object Home : BottomNavItem("home", Icons.Filled.Home, "Home", { HomeScreen() })
    object Likes : BottomNavItem("likes", Icons.Filled.Star, "Likes", { LikeScreen() })
}

sealed class PokedexRoutes(val itemList: List<BottomNavItem>){
    object MainRoute: PokedexRoutes(listOf(Home, Likes))
}