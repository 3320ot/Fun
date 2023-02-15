package com.app.`fun`.presentation.screens.catalogs

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.app.`fun`.presentation.ui.theme.floating2

@Composable
fun ItemCatalogs() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, end = 8.dp, start = 8.dp, bottom = 12.dp)
            .height(110.dp)
            .clip(RoundedCornerShape(24.dp))
            .background(floating2)
            .clickable { }

    ) {
        Row(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                modifier = Modifier
                    .height(48.dp)
                    .width(48.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .clickable {  },
                contentAlignment = Alignment.Center
            ) {


                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "more",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(8.dp)
                        .height(30.dp)
                        .width(30.dp)


                )
            }
        }
    }
}