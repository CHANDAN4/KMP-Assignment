package com.example.kmptestapp.ui.dashboard.setting.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SettingNavGraph() {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Setting.SettingPage.route
    ) {

        composable(Setting.SettingPage.route) {
            //HomePage(navController)
        }
    }



}


sealed class Setting(val route : String){
    object SettingPage : Setting("SearchPage")
}