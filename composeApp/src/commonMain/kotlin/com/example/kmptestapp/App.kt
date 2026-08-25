package com.example.kmptestapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.kmptestapp.theme.MyAppTheme
import com.example.kmptestapp.ui.dashboard.views.Dashboard

@Composable
@Preview
fun App() {

    MyAppTheme {
        Dashboard()
    }


}