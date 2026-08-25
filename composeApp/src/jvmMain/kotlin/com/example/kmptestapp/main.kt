package com.example.kmptestapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.kmptestapp.koin.appModule
import org.koin.core.context.GlobalContext.startKoin

fun main() = application {

    startKoin {
        modules(appModule)
    }

    Window(
        onCloseRequest = ::exitApplication,
        title = "KMPTestApp",
    ) {
        App()
    }
}