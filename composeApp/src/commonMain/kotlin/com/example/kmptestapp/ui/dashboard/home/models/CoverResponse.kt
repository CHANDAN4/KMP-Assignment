package com.example.kmptestapp.ui.dashboard.home.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoverResponse(
    @SerialName("cover")
    val cover: String,
    @SerialName("coverCode")
    val coverCode: String,
    @SerialName("id")
    val id: String
)