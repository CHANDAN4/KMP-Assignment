package com.example.kmptestapp.ui.dashboard.profile.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ProfileNavGraph() {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Profile.ProfilePage.route
    ) {

        composable(Profile.ProfilePage.route) {
            //EditProfilePage(navController)
        }
    }



}


sealed class Profile(val route : String){
    object ProfilePage : Profile("ProfilePage")
}