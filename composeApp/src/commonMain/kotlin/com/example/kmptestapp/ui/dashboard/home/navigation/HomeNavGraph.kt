package com.example.kmptestapp.ui.dashboard.home.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kmptestapp.ui.dashboard.home.views.HomePage

@Composable
fun HomeNavGraph() {
    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Home.homePage.route
    ) {

        composable(Home.homePage.route) {
            //HomePage(navController)
        }
    }



}


sealed class Home(val route : String){
    object homePage :Home("HomePage")
}