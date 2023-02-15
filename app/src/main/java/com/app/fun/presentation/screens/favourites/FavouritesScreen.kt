package com.app.`fun`.presentation.screens.favourites

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.app.`fun`.presentation.screens.catalogs.ItemCatalogs
import com.app.`fun`.presentation.ui.theme.Gray
import com.app.`fun`.presentation.ui.theme.Gray2
import com.app.`fun`.presentation.ui.theme.floating

@Composable
fun FavouritesScreen(
    navController: NavHostController
) {
    Scaffold {
        Column(
            Modifier
                .padding(it)
                .fillMaxSize()
                .background(Gray2)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .padding(24.dp)
                        .clip(RoundedCornerShape(28.dp))
                        .background(Gray)
                ) {
                    Text(
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                        text = "Favorites",
                        modifier = Modifier
                            .padding(horizontal = 24.dp)
                    )
                }

            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .fillMaxHeight()
                ) {
                    ItemCatalogs()
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                ) {
                    ItemCatalogs()
                }
            }


        }
    }
}