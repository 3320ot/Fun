package com.app.`fun`.presentation.screens.gallery

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun GalleryScreen(
    navController: NavHostController
) {
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Text("Gallery Hi")
    }
}