package com.app.`fun`.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.app.`fun`.presentation.navigation.SetupNavHost
import com.app.`fun`.presentation.ui.theme.FunTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            FunTheme {
                SetupNavHost(navController = navController)
            }
        }
    }
}