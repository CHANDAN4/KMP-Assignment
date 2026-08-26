package com.example.kmptestapp.ui.dashboard.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel
import com.example.kmptestapp.ui.dashboard.home.views.HomePage
import com.example.kmptestapp.ui.dashboard.search.views.SearchPage
import com.example.kmptestapp.ui.dashboard.views.DashboardScreen
import com.example.kmptestapp.ui.splash.SplashComposeView

@Composable
fun MainNavGraph(){


    val navController= rememberNavController()

    NavHost(navController = navController, startDestination = Main.SplashScreen.route){


        composable(route= Main.SplashScreen.route){
            SplashComposeView(navController)
        }

        composable(route= Main.DashboardScreen.route){
            DashboardScreen()
        }


    }

}


sealed class Main(val route: String){

    object SplashScreen: Main("splashScreen")

    object DashboardScreen: Main("DashboardScreen")


}