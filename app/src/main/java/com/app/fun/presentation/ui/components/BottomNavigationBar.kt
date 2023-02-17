package com.app.`fun`.presentation.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.app.`fun`.presentation.navigation.Screens

val items = listOf(
    Screens.HomeScreen,
    Screens.CatalogsScreen,
//    Screens.GalleryScreen,
    Screens.FavouritesScreen,
    Screens.UserScreen,
)

@Composable
fun BottomNavigationBar(
    navController: NavHostController
) {
    BottomAppBar(
        Modifier.fillMaxWidth()
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        items.forEach { screen ->
            BottomNavigationItem(
                selected = currentDestination?.hierarchy?.any { it.route == screen.rout } == true,
                icon = {
                    Icon(
                        imageVector = screen.icon,
                        contentDescription = screen.rout
                    )
                },
                label = {
                    currentDestination?.route?.let { Text(screen.rout) }
                },
                onClick = {
                    navController.navigate(screen.rout) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}