package com.example.kmptestapp.ui.dashboard.home.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ClaimAssessmentExces(
    @SerialName("excessAmount")
    val excessAmount: Double,
    @SerialName("excessGstRate")
    val excessGstRate: String?=null,
    @SerialName("excessName")
    val excessName: String?=null,
    @SerialName("id")
    val id: String
)