package com.example.jmrealestate.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jmrealestate.ui.theme.screens.about.AboutScreen
import com.example.jmrealestate.ui.theme.screens.detail.DetailScreen
import com.example.jmrealestate.ui.theme.screens.home.HomeScreen
import com.example.jmrealestate.ui.theme.screens.intent.IntentScreen
import com.example.jmrealestate.ui.theme.screens.login.LoginScreen
import com.example.jmrealestate.ui.theme.screens.property.PropertyScreen
import com.example.jmrealestate.ui.theme.screens.signup.SignupScreen
import com.example.jmrealestate.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)

        }
        composable(ROUT_DETAIL) {
            DetailScreen(navController = navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }
        composable(ROUT_PROPERTY) {
            PropertyScreen(navController = navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController = navController)
        }
        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController =navController )
        }

    }
}