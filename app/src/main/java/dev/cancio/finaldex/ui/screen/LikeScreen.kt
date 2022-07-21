package dev.cancio.finaldex.ui.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import dev.cancio.finaldex.viewmodel.MainViewModel

@Composable
fun LikeScreen(
    navController: NavHostController,
    viewModel: MainViewModel
) {
    Text(text = "like")
}