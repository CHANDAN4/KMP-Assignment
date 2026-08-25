package com.example.kmptestapp.ui.dashboard.home.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ClaimAssessmentSurveyorCharge(
    @SerialName("chargesAmount")
    val chargesAmount: Double,
    @SerialName("chargesDesc")
    val chargesDesc: String,
    @SerialName("chargesName")
    val chargesName: String,
    @SerialName("id")
    val id: String,
    @SerialName("surveyorChargesGsTdsRate")
    val surveyorChargesGsTdsRate: Double,
    @SerialName("surveyorChargesGstRate")
    val surveyorChargesGstRate: Double,
    @SerialName("surveyorChargesTdsRate")
    val surveyorChargesTdsRate: Double
)