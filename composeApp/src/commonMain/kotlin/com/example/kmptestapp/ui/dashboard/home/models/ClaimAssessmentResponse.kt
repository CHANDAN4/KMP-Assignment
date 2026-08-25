package com.example.kmptestapp.ui.dashboard.home.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ClaimAssessmentResponse(
    @SerialName("claimAssessmentExcess")
    val claimAssessmentExcess: List<ClaimAssessmentExces>,
    @SerialName("claimAssessmentSurveyorCharges")
    val claimAssessmentSurveyorCharges: List<ClaimAssessmentSurveyorCharge>,
    @SerialName("excessGst")
    val excessGst: Double,
    @SerialName("excessGstRate")
    val excessGstRate: String?=null,
    @SerialName("expiryDate")
    val expiryDate: String?=null,
    @SerialName("finalGstAmount")
    val finalGstAmount: Double,
    @SerialName("finalRecommendation")
    val finalRecommendation: String?=null,
    @SerialName("grossAssessmentAmount")
    val grossAssessmentAmount: Double,
    @SerialName("invoiceResponses")
    val invoiceResponses: List<InvoiceResponse>,
    @SerialName("netAssessmentAmount")
    val netAssessmentAmount: Double?=null,
    @SerialName("oiclGstNo")
    val oiclGstNo: String?=null,
    @SerialName("salvageAmount")
    val salvageAmount: Double?=null,
    @SerialName("salvageGst")
    val salvageGst: Double?=null,
    @SerialName("salvageGstRate")
    val salvageGstRate: Double?=null,
    @SerialName("surveyorAddress")
    val surveyorAddress: String?=null,
    @SerialName("surveyorBillingState")
    val surveyorBillingState: String?=null,
    @SerialName("surveyorBillingStateCode")
    val surveyorBillingStateCode: String?=null,
    @SerialName("surveyorBillingStateName")
    val surveyorBillingStateName: String?=null,
    @SerialName("surveyorChargesGst")
    val surveyorChargesGst: Double,
    @SerialName("surveyorChargesGstRate")
    val surveyorChargesGstRate: String?=null,
    @SerialName("surveyorChargesGstTds")
    val surveyorChargesGstTds: Double,
    @SerialName("surveyorChargesGstTdsRate")
    val surveyorChargesGstTdsRate: String?=null,
    @SerialName("surveyorChargesTds")
    val surveyorChargesTds: Double,
    @SerialName("surveyorChargesTdsRate")
    val surveyorChargesTdsRate: String?=null,
    @SerialName("surveyorChargesTotalClaimedAmount")
    val surveyorChargesTotalClaimedAmount: Double,
    @SerialName("surveyorDeclaration")
    val surveyorDeclaration: Boolean,
    @SerialName("surveyorEmail")
    val surveyorEmail: String?=null,
    @SerialName("surveyorGst")
    val surveyorGst: String?=null,
    @SerialName("surveyorGstApplicable")
    val surveyorGstApplicable: Boolean,
    @SerialName("surveyorGstInvoiceDate")
    val surveyorGstInvoiceDate: String?=null,
    @SerialName("surveyorGstInvoiceNo")
    val surveyorGstInvoiceNo: String?=null,
    @SerialName("surveyorLicenseNo")
    val surveyorLicenseNo: String?=null,
    @SerialName("surveyorMobile")
    val surveyorMobile: String?=null,
    @SerialName("surveyorName")
    val surveyorName: String?=null,
    @SerialName("surveyorPanNo")
    val surveyorPanNo: String?=null,
    @SerialName("totalDepriciatedAmount")
    val totalDepriciatedAmount: Double?=null,
    @SerialName("totalExcessAmount")
    val totalExcessAmount: Double?=null,
    @SerialName("totalGstOnDepriciated")
    val totalGstOnDepriciated: Double?=null,
    @SerialName("totalInvoiceAmount")
    val totalInvoiceAmount: Double?=null,
    @SerialName("totalInvoiceGstAmount")
    val totalInvoiceGstAmount: Double?=null,
    @SerialName("totalSurveyorChargesAmount")
    val totalSurveyorChargesAmount: Double?=null
)