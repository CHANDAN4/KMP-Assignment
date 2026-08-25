package com.example.kmptestapp.ui.dashboard.home.models.request

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id:Int,
    val name:String,
    val email:String
)