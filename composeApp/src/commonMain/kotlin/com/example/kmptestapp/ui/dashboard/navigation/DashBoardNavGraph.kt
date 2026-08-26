package com.example.kmptestapp.ui.dashboard.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel
import com.example.kmptestapp.ui.dashboard.home.views.HomePage
import com.example.kmptestapp.ui.dashboard.search.views.SearchPage
import com.example.kmptestapp.ui.splash.SplashComposeView

@Composable
fun DashBoardNavGraph(homeViewModel: HomeViewModel,navController: NavHostController){


    NavHost(navController = navController, startDestination = Dashboard.HomePage.route){

        composable(route= Dashboard.HomePage.route){
            HomePage(homeViewModel,navController)
        }


        composable(route= Dashboard.SearchPage.route){
            SearchPage(homeViewModel,navController)
        }

    }

}


sealed class Dashboard(val route: String){

    object HomePage: Dashboard("homePage")

    object SearchPage: Dashboard("searchPage")


}