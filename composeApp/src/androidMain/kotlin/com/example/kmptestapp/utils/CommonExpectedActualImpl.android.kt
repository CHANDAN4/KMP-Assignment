package com.example.kmptestapp.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.core.view.WindowCompat
import com.example.kmptestapp.application.App
import java.util.UUID

lateinit var activity: Activity

actual fun getType(): Type {
    return Type.Mobile
}

actual fun getRandomId(): String {
    return UUID.randomUUID().toString()
}


actual fun setStatusBar( darkIcons: Boolean) {

    activity.window.statusBarColor = Color(0xFF6650A3).toArgb()

    WindowCompat.getInsetsController(
        activity.window,
        activity.window.decorView
    ).isAppearanceLightStatusBars = darkIcons

}





actual fun openApp(packageName: String): Boolean {

    val context = App()

    val intent = context.packageManager.getLaunchIntentForPackage(packageName)

    return if (intent != null) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
        true
    } else {
        // App not installed
        context.startActivity(
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://play.google.com/store/apps/details?id=$packageName")
            ).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
        )
        false
    }
}




