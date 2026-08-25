package com.example.kmptestapp.ui.dashboard.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import assignment.composeapp.generated.resources.Res
import assignment.composeapp.generated.resources.home
import assignment.composeapp.generated.resources.search
import assignment.composeapp.generated.resources.settings
import assignment.composeapp.generated.resources.user
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel
import com.example.kmptestapp.ui.dashboard.navigation.DashBoardNavGraph
import com.example.kmptestapp.ui.dashboard.navigation.Dashboard

import org.jetbrains.compose.resources.painterResource
import org.koin.compose.viewmodel.koinViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard() {

    val homeViewModel: HomeViewModel = koinViewModel()
    val navController = rememberNavController()
    var selectedTab by remember {
        mutableStateOf(0)
    }


    Scaffold(
        bottomBar = {
            NavigationBar {

                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = {
                        selectedTab = 0
                        navController.navigate(Dashboard.HomePage.route) {
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(Res.drawable.home),
                            contentDescription = "Home",
                            tint = Color.Gray,
                            modifier = Modifier.size(30.dp)
                        )
                    },

                    label = {
                        Text("Home")
                    }
                )

              /*  NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = {
                        selectedTab = 1
                        navController.navigate(Dashboard.ProfilePage.route) {
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(Res.drawable.user),
                            contentDescription = "Profile",
                            tint = Color.Gray,
                            modifier = Modifier.size(30.dp)
                        )
                    },
                    label = {
                        Text("Profile")
                    }
                )*/

                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = {
                        selectedTab = 1
                        navController.navigate(Dashboard.SearchPage.route) {
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(Res.drawable.search),
                            contentDescription = "Search",
                            tint = Color.Gray,
                            modifier = Modifier.size(30.dp)
                        )
                    },
                    label = {
                        Text("Search")
                    }
                )

               /* NavigationBarItem(
                    selected = selectedTab == 3,
                    onClick = {
                        selectedTab = 3
                        navController.navigate(Dashboard.SettingPage.route) {
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(Res.drawable.settings),
                            contentDescription = "Setting",
                            tint = Color.Gray,
                            modifier = Modifier.size(30.dp)
                        )
                    },
                    label = {
                        Text("Setting")
                    }
                )*/

            }
        }
    ) { paddingValues ->

        Box(modifier = Modifier.fillMaxSize().padding(paddingValues)) {

            DashBoardNavGraph(homeViewModel,navController)

        }
    }

}