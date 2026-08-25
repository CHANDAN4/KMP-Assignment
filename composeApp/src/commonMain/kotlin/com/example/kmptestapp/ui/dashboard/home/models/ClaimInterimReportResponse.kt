package com.example.kmptestapp.ui.dashboard.home.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ClaimInterimReportResponse(
    @SerialName("claimNo")
    val claimNo: String?=null,
    @SerialName("createBy")
    val createBy: String?=null,
    @SerialName("createDate")
    val createDate: String?=null,
    @SerialName("dateOfSurvey")
    val dateOfSurvey: String?=null,
    @SerialName("drivingLicenseApplicable")
    val drivingLicenseApplicable: Boolean?=null,
    @SerialName("drivingLicenseRcVerified")
    val drivingLicenseRcVerified: Boolean?=null,
    @SerialName("drivingLicenseRcVerifiedRemarks")
    val drivingLicenseRcVerifiedRemarks: String?=null,
    @SerialName("emailIdOfClaimant")
    val emailIdOfClaimant: String?=null,
    @SerialName("expectedDateOfCompletionOfRepair")
    val expectedDateOfCompletionOfRepair: String?=null,
    @SerialName("id")
    val id: String?=null,
    @SerialName("initialLossAmount")
    val initialLossAmount: Double?=null,
    @SerialName("mobileNoOfClaimant")
    val mobileNoOfClaimant: String?=null,
    @SerialName("natureOfAccident")
    val natureOfAccident: String?=null,
    @SerialName("particularsOfLoss")
    val particularsOfLoss: String?=null,
    @SerialName("placeOfSurvey")
    val placeOfSurvey: String?=null,
    @SerialName("spotSurveyDone")
    val spotSurveyDone: Boolean?=null,
    @SerialName("spotSurveyDoneRemarks")
    val spotSurveyDoneRemarks: String?=null,
    @SerialName("submissionDateOfFinalDocument")
    val submissionDateOfFinalDocument: String?=null,
    @SerialName("surveyCompleted")
    val surveyCompleted: Boolean?=null,
    @SerialName("surveyorAppointedDate")
    val surveyorAppointedDate: String?=null,
    @SerialName("surveyorObservation")
    val surveyorObservation: String?=null,
    @SerialName("timeOfSurvey")
    val timeOfSurvey: String?=null,
    @SerialName("typeOfSettlement")
    val typeOfSettlement: String?=null,
    @SerialName("updateBy")
    val updateBy: String?=null,
    @SerialName("updateDate")
    val updateDate: String?=null,
    @SerialName("whetherVehicleInspected")
    val whetherVehicleInspected: Boolean?=null
)