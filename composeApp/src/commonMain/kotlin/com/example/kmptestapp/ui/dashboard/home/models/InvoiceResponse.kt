package com.example.kmptestapp.ui.dashboard.home.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InvoiceResponse(
    @SerialName("gstType")
    val gstType: String,
    @SerialName("id")
    val id: String,
    @SerialName("invoiceAmount")
    val invoiceAmount: Double,
    @SerialName("invoiceDate")
    val invoiceDate: String,
    @SerialName("invoiceGstAmount")
    val invoiceGstAmount: Double,
    @SerialName("invoiceNumber")
    val invoiceNumber: String,
    @SerialName("lineItemsResponse")
    val lineItemsResponse: List<LineItemsResponse>
)