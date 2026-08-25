package com.example.kmptestapp.utils

import androidx.compose.ui.graphics.Color
import com.sun.tools.javac.util.Context
import java.awt.Desktop
import java.net.URI
import java.util.UUID

actual fun getType(): Type {
    return Type.Desktop
}

actual fun getRandomId(): String {
    return UUID.randomUUID().toString()
}


actual fun setStatusBar(darkIcons: Boolean) {

}

actual fun openApp(packageName: String): Boolean{
    return try {
        Desktop.getDesktop().browse(URI("https://example.com"))
        true
    } catch (e: Exception) {
        false
    }
}