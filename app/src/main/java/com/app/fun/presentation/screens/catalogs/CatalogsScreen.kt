package com.app.`fun`.presentation.screens.catalogs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun CatalogsScreen(
    navController: NavHostController
) {
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Text("Catalogs Hi")
    }
}