package com.example.kmptestapp.ui.dashboard.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel
import com.example.kmptestapp.ui.dashboard.profile.views.ProfilePage
import com.example.kmptestapp.ui.dashboard.search.views.SearchPage
import com.example.kmptestapp.ui.dashboard.setting.views.SettingPage
import com.example.kmptestapp.ui.dashboard.home.views.HomePage
import com.example.kmptestapp.ui.dashboard.profile.views.EditProfilePage
import com.example.kmptestapp.ui.dashboard.setting.views.ChangePassword
import com.example.kmptestapp.ui.dashboard.setting.views.PrivacyPolicy
import com.example.kmptestapp.ui.dashboard.setting.views.RateApp
import com.example.kmptestapp.ui.dashboard.setting.views.ResetPassword
import com.example.kmptestapp.ui.splash.SplashComposeView

@Composable
fun DashBoardNavGraph(homeViewModel: HomeViewModel,navController: NavHostController){


    NavHost(navController = navController, startDestination = Dashboard.Splash.route){


        composable(route= Dashboard.Splash.route){
            SplashComposeView(homeViewModel,navController)
        }

        composable(route= Dashboard.HomePage.route){
            HomePage(homeViewModel,navController)
        }

        composable(route= Dashboard.ProfilePage.route){
            ProfilePage(homeViewModel,navController)
        }

        composable(route= Dashboard.SearchPage.route){
            SearchPage(homeViewModel,navController)
        }

        composable(route= Dashboard.SettingPage.route){
            SettingPage(homeViewModel,navController)
        }

        composable(route= Dashboard.EditProfile.route){
            EditProfilePage(homeViewModel,navController)
        }

        composable(route= Dashboard.ChangePassword.route){
            ChangePassword(homeViewModel,navController)
        }

        composable(route= Dashboard.ResetPassword.route){
            ResetPassword(homeViewModel,navController)
        }

        composable(route= Dashboard.PrivacyPolicy.route){
            PrivacyPolicy(homeViewModel,navController)
        }

        composable(route= Dashboard.RateApp.route){
            RateApp(homeViewModel,navController)
        }


    }

}


sealed class Dashboard(val route: String){

    object Splash: Dashboard("splash")
    object HomePage: Dashboard("homePage")
    object ProfilePage: Dashboard("profilePage")
    object SearchPage: Dashboard("searchPage")
    object SettingPage: Dashboard("settingPage")
    object EditProfile: Dashboard("editProfile")
    object ChangePassword: Dashboard("ChangePassword")
    object ResetPassword: Dashboard("ResetPassword")
    object PrivacyPolicy: Dashboard("PrivacyPolicy")
    object RateApp: Dashboard("RateApp")

}