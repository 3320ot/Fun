package com.app.`fun`.presentation.screens.catalogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.app.`fun`.presentation.ui.theme.Gray
import com.app.`fun`.presentation.ui.theme.Gray2
import com.app.`fun`.presentation.ui.theme.floating
import com.app.`fun`.presentation.ui.theme.floating2

@Composable
fun CatalogsScreen(
    navController: NavHostController
) {
    Scaffold(
        floatingActionButton = { FloatingActionButton(
            onClick = { /*TODO*/ },
            backgroundColor = floating,
            modifier = Modifier
                .height(70.dp)
                .width(70.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Add,
                contentDescription = "add",
                tint = Color.White,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)

            )
        }}
    ) {
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
                        text = "Catalogs",
                        modifier = Modifier
                            .padding(horizontal = 24.dp)
                    )
                }

            }
            Row(
                modifier = Modifier
                    .padding(vertical = 24.dp)
                    .height(30.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth(0.5f),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        fontSize = 18.sp,
                        text = "My",
                        color = Color.White
                    )
                }
                Row(
                    modifier = Modifier
                ) {
                    Text(
                        fontSize = 18.sp,
                        text = "|",
                        color = Gray
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        fontSize = 18.sp,
                        text = "Discovery",
                        color = Color.White
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