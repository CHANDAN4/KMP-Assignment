package com.example.kmptestapp.utils
import androidx.compose.ui.graphics.Color
import platform.Foundation.NSURL
import platform.UIKit.UIApplication
import kotlin.random.Random
actual fun getType(): Type {
    return Type.Mobile
}

actual fun getRandomId(): String {
    return Random.nextInt().toString()
}



actual fun setStatusBar(darkIcons: Boolean) {
}


actual fun openApp(packageName: String): Boolean{
    val url = NSURL.URLWithString("yourapp://")

    return if (url != null) {
        UIApplication.sharedApplication.openURL(url)
        true
    } else {
        false
    }
}

