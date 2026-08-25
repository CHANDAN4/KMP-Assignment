package com.example.kmptestapp.ui.dashboard.search.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SearchNavGraph() {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Search.SearchPage.route
    ) {

        composable(Search.SearchPage.route) {
            //HomePage(navController)
        }
    }



}


sealed class Search(val route : String){
    object SearchPage : Search("SearchPage")
}