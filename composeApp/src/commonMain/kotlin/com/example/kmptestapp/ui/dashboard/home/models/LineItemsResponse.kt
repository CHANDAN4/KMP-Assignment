package com.example.kmptestapp.ui.dashboard.home.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LineItemsResponse(
    @SerialName("amount")
    val amount: Double,
    @SerialName("cgstAmount")
    val cgstAmount: Double,
    @SerialName("cgstDepreciatedAmount")
    val cgstDepreciatedAmount: Double,
    @SerialName("cgstRate")
    val cgstRate: Double,
    @SerialName("estimatedAmount")
    val estimatedAmount: Double,
    @SerialName("estimatedAmountRemark")
    val estimatedAmountRemark: String,
    @SerialName("gstType")
    val gstType: String,
    @SerialName("hsnCode")
    val hsnCode: String,
    @SerialName("id")
    val id: String,
    @SerialName("igstAmount")
    val igstAmount: Double,
    @SerialName("igstDepreciatedAmount")
    val igstDepreciatedAmount: Double,
    @SerialName("igstRate")
    val igstRate: Double,
    @SerialName("itemCode")
    val itemCode: String,
    @SerialName("itemDepreciatedAmount")
    val itemDepreciatedAmount: Double,
    @SerialName("itemDepreciationAmount")
    val itemDepreciationAmount: Double,
    @SerialName("itemDepreciationRate")
    val itemDepreciationRate: Double,
    @SerialName("itemDesc")
    val itemDesc: String,
    @SerialName("itemInvoiceDate")
    val itemInvoiceDate: String,
    @SerialName("itemInvoiceNumber")
    val itemInvoiceNumber: String,
    @SerialName("itemSubType")
    val itemSubType: String,
    @SerialName("itemSubtotal")
    val itemSubtotal: String?=null,
    @SerialName("itemSyncCode")
    val itemSyncCode: String?=null,
    @SerialName("sgstAmount")
    val sgstAmount: Double,
    @SerialName("sgstDepreciatedAmount")
    val sgstDepreciatedAmount: Double,
    @SerialName("sgstRate")
    val sgstRate: Double,
    @SerialName("sideDesc")
    val sideDesc: String
)