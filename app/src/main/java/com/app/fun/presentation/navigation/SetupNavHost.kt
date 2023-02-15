package com.app.`fun`.presentation.navigation

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.Icon
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.sharp.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.`fun`.R
import com.app.`fun`.presentation.screens.catalogs.CatalogsScreen
import com.app.`fun`.presentation.screens.favourites.FavouritesScreen
import com.app.`fun`.presentation.screens.gallery.GalleryScreen
import com.app.`fun`.presentation.screens.home.HomeScreen
import com.app.`fun`.presentation.screens.user.UserScreen
import com.app.`fun`.presentation.ui.components.BottomNavigationBar


sealed class Screens(
    val rout: String,
    val icon: ImageVector
    )
{
    object HomeScreen: Screens(rout = "Главная", Icons.Filled.Home)
    object CatalogsScreen: Screens(rout = "Каталог", Icons.Filled.DateRange)
//    object GalleryScreen: Screens(rout = "Галерея", Icons.Filled.AddCircle)
    object FavouritesScreen: Screens(rout = "Избранное", Icons.Default.Star)
    object UserScreen: Screens(rout = "Я", Icons.Sharp.AccountCircle)
}

@Composable
fun SetupNavHost(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.HomeScreen.rout,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(route = Screens.HomeScreen.rout) {
                HomeScreen(navController = navController)
            }
            composable(route = Screens.CatalogsScreen.rout) {
                CatalogsScreen(navController = navController)
            }
//            composable(route = Screens.GalleryScreen.rout) {
//                GalleryScreen(navController = navController)
//            }
            composable(route = Screens.FavouritesScreen.rout) {
                FavouritesScreen(navController = navController)
            }
            composable(route = Screens.UserScreen.rout) {
                UserScreen(navController = navController)
            }
        }
    }
}