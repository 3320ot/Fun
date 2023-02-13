package com.app.`fun`.presentation.screens.favourites

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun FavouritesScreen(
    navController: NavHostController
) {
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Text("Favourites Hi")
    }
}