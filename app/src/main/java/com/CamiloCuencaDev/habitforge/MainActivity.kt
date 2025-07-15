package com.CamiloCuencaDev.habitforge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.CamiloCuencaDev.habitforge.ui.Home.Home
import com.CamiloCuencaDev.habitforge.ui.SignIn.ForgotPassword
import com.CamiloCuencaDev.habitforge.ui.SignIn.SignIn
import com.CamiloCuencaDev.habitforge.ui.WelcomeScreen.Welcome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(navController, startDestination = "welcome") {
                //Rutas de navegación
                composable("welcome") {
                    Welcome(navController)
                }
                composable("SignIn") {
                    SignIn(navController)
                }
                composable("Home") {
                    Home(navController)
                }
                composable("ForgotPassword") {
                    ForgotPassword(navController)
                }

            }

        }
    }
}

