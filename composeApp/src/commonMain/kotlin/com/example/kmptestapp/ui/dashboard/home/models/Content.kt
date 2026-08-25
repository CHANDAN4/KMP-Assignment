package com.example.kmptestapp.ui.dashboard.home.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Content(
    @SerialName("ageMonth")
    val ageMonth: Int,
    @SerialName("ageOfVehicle")
    val ageOfVehicle: String,
    @SerialName("areaOfOperation")
    val areaOfOperation: String?=null,
    @SerialName("attachments")
    val attachments: List<Attachment>,
    @SerialName("autorizationNumber")
    val autorizationNumber: String?=null,
    @SerialName("caseNoReferenceNo")
    val caseNoReferenceNo: String,
    @SerialName("claimAssessmentResponse")
    val claimAssessmentResponse: ClaimAssessmentResponse,
    @SerialName("claimIntDate")
    val claimIntDate: String,
    @SerialName("claimInterimReportResponse")
    val claimInterimReportResponse: ClaimInterimReportResponse,
    @SerialName("claimNo")
    val claimNo: String,
    @SerialName("claimStatus")
    val claimStatus: String,
    @SerialName("claimType")
    val claimType: String,
    @SerialName("claimTypeCode")
    val claimTypeCode: String? = null,
    @SerialName("classOfVehicle")
    val classOfVehicle: String?=null,
    @SerialName("closeProximity")
    val closeProximity: Boolean,
    @SerialName("colorOfVehicle")
    val colorOfVehicle: String?=null,
    @SerialName("coverResponse")
    val coverResponse: List<CoverResponse>,
    @SerialName("createBy")
    val createBy: String?=null,
    @SerialName("createDate")
    val createDate: String?=null,
    @SerialName("dateOfLoss")
    val dateOfLoss: String?=null,
    @SerialName("delayInIntimationDays")
    val delayInIntimationDays: String?=null,
    @SerialName("driverAddress")
    val driverAddress: String?=null,
    @SerialName("driverChargesField")
    val driverChargesField: String? = null,
    @SerialName("driverCity")
    val driverCity: String?=null,
    @SerialName("driverCityCode")
    val driverCityCode: String?=null,
    @SerialName("driverCountry")
    val driverCountry: String,
    @SerialName("driverDateOfBirth")
    val driverDateOfBirth: String,
    @SerialName("driverLicenseBadgeIssuingDate")
    val driverLicenseBadgeIssuingDate: String,
    @SerialName("driverLicenseBadgeNo")
    val driverLicenseBadgeNo: String? = null,
    @SerialName("driverLicenseNoOne")
    val driverLicenseNoOne: String,
    @SerialName("driverLicenseNoThree")
    val driverLicenseNoThree: String,
    @SerialName("driverLicenseNoTwo")
    val driverLicenseNoTwo: String,
    @SerialName("driverLicenseTypeCode")
    val driverLicenseTypeCode: String,
    @SerialName("driverName")
    val driverName: String,
    @SerialName("driverPincode")
    val driverPincode: String,
    @SerialName("driverQualification")
    val driverQualification: String? = null,
    @SerialName("driverState")
    val driverState: String,
    @SerialName("driverStateCode")
    val driverStateCode: String,
    @SerialName("fitnessValidUpTo")
    val fitnessValidUpTo: String,
    @SerialName("id")
    val id: String,
    @SerialName("insuredName")
    val insuredName: String,
    @SerialName("invoiceNumber")
    val invoiceNumber: String,
    @SerialName("issueingRto")
    val issueingRto: String? = null,
    @SerialName("licenseNo")
    val licenseNo: String,
    @SerialName("licenseType")
    val licenseType: String,
    @SerialName("lossDescription")
    val lossDescription: String,
    @SerialName("makeCode")
    val makeCode: String,
    @SerialName("modelCode")
    val modelCode: String,
    @SerialName("nameOfWorkshop")
    val nameOfWorkshop: String,
    @SerialName("nilDepreciationCover")
    val nilDepreciationCover: Boolean,
    @SerialName("ownerDriver")
    val ownerDriver: Boolean,
    @SerialName("permitNumber")
    val permitNumber: String?=null,
    @SerialName("permitValidUpTo")
    val permitValidUpTo: String,
    @SerialName("policyEndDate")
    val policyEndDate: String,
    @SerialName("policyNumber")
    val policyNumber: String,
    @SerialName("policyStartDate")
    val policyStartDate: String,
    @SerialName("policyType")
    val policyType: String,
    @SerialName("policyTypeCode")
    val policyTypeCode: String,
    @SerialName("productReferenceNo")
    val productReferenceNo: String,
    @SerialName("proposalNoReferenceNo")
    val proposalNoReferenceNo: String,
    @SerialName("registeredLadenWeight")
    val registeredLadenWeight: String?=null,
    @SerialName("reimbursementType")
    val reimbursementType: String,
    @SerialName("relationshipOfDriver")
    val relationshipOfDriver: String,
    @SerialName("roadTaxPaidUpTo")
    val roadTaxPaidUpTo: String?=null,
    @SerialName("seatingCarryingCapacity")
    val seatingCarryingCapacity: String?=null,
    @SerialName("sec64Confirmed")
    val sec64Confirmed: Boolean,
    @SerialName("source")
    val source: String,
    @SerialName("stageReferenceNo")
    val stageReferenceNo: String,
    @SerialName("status")
    val status: String,
    @SerialName("surveyorAddress")
    val surveyorAddress: String? = null,
    @SerialName("surveyorCode")
    val surveyorCode: String?=null,
    @SerialName("surveyorEmail")
    val surveyorEmail: String?=null,
    @SerialName("surveyorFormStage")
    val surveyorFormStage: String?=null,
    @SerialName("surveyorGst")
    val surveyorGst: String? = null,
    @SerialName("surveyorGstInvoiceDate")
    val surveyorGstInvoiceDate: String?=null,
    @SerialName("surveyorGstInvoiceNo")
    val surveyorGstInvoiceNo: String?=null,
    @SerialName("surveyorMobile")
    val surveyorMobile: String? = null,
    @SerialName("surveyorName")
    val surveyorName: String,
    @SerialName("surveyorPanNo")
    val surveyorPanNo: String?=null,
    @SerialName("synqStatus")
    val synqStatus: String,
    @SerialName("thirdPartyInvolved")
    val thirdPartyInvolved: Boolean,
    @SerialName("typeOfBody")
    val typeOfBody: String?=null,
    @SerialName("typeOfFuel")
    val typeOfFuel: String?=null,
    @SerialName("typeOfPermit")
    val typeOfPermit: String?=null,
    @SerialName("unladenWeight")
    val unladenWeight: String?=null,
    @SerialName("updateBy")
    val updateBy: String?=null,
    @SerialName("updateDate")
    val updateDate: String?=null,
    @SerialName("validFrom")
    val validFrom: String?=null,
    @SerialName("validUpTo")
    val validUpTo: String?=null,
    @SerialName("validatityOfAuthorization")
    val validatityOfAuthorization: String?=null,
    @SerialName("vehicleChasisNumber")
    val vehicleChasisNumber: String?=null,
    @SerialName("vehicleCubicCapacity")
    val vehicleCubicCapacity: String?=null,
    @SerialName("vehicleEngineNumber")
    val vehicleEngineNumber: String?=null,
    @SerialName("vehicleMake")
    val vehicleMake: String?=null,
    @SerialName("vehicleModel")
    val vehicleModel: String?=null,
    @SerialName("vehicleRegistrationDate")
    val vehicleRegistrationDate: String?=null,
    @SerialName("vehicleRegistrationNumber")
    val vehicleRegistrationNumber: String?=null,
    @SerialName("vehicleRtoCode")
    val vehicleRtoCode: String?=null,
    @SerialName("vehicleRtoDesc")
    val vehicleRtoDesc: String?=null,
    @SerialName("vehicleYearOfManufacture")
    val vehicleYearOfManufacture: String?=null,
    @SerialName("workshopEstimateAmount")
    val workshopEstimateAmount: Double,
    @SerialName("workshopEstimateDate")
    val workshopEstimateDate: String?=null,
    @SerialName("workshopGst")
    val workshopGst: String?=null,
    @SerialName("workshopInvoiceAmount")
    val workshopInvoiceAmount: Double,
    @SerialName("workshopInvoiceDate")
    val workshopInvoiceDate: String?=null
)