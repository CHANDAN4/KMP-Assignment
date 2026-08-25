package com.example.kmptestapp.ui.dashboard.home.models.products


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Dimensions(
    @SerialName("depth")
    val depth: Double,
    @SerialName("height")
    val height: Double,
    @SerialName("width")
    val width: Double
)