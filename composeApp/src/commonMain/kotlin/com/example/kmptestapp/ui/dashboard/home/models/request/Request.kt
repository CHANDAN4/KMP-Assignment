package com.example.kmptestapp.ui.dashboard.home.models.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Request(
    @SerialName("payload")
    val payload: String
)