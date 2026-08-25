package com.example.kmptestapp.koin

import kotlin.collections.listOf

actual class KoinInitializer {
    actual fun initialize() {
        initKoin(
            platformModules = listOf()
        )
    }

}