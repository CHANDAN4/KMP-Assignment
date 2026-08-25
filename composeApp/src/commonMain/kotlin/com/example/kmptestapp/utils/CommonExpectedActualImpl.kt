package com.example.kmptestapp.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

expect fun getType():Type

expect fun getRandomId(): String


expect fun setStatusBar(
    darkIcons: Boolean
)

expect fun openApp(packageName: String): Boolean