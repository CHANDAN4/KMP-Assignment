package com.example.kmptestapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.kmptestapp.theme.MyAppTheme
import com.example.kmptestapp.ui.dashboard.navigation.MainNavGraph
import com.example.kmptestapp.ui.splash.SplashComposeView

@Composable
@Preview
fun App() {

    MyAppTheme {

        MainNavGraph()
    }


}