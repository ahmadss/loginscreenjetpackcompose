package com.adematici.loginscreenui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.adematici.loginscreenui.ui.screens.*
import com.adematici.loginscreenui.ui.theme.LoginScreenUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreenUITheme {
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen") {
        composable("splash_screen") {
            SplashScreens(navController = navController)
        }
        composable("login_screen") {
            LoginScreens(navController = navController)
        }
        composable("register_screen") {
            RegisterScreens(navController = navController)
        }
    }
}