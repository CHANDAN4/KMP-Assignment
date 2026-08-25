package com.example.kmptestapp.ui.dashboard.home.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attachment(
    @SerialName("bucketName")
    val bucketName: String?=null,
    @SerialName("documentComment")
    val documentComment: String?=null,
    @SerialName("documentNo")
    val documentNo: String?=null,
    @SerialName("documentType")
    val documentType: String?=null,
    @SerialName("documentTypeDesc")
    val documentTypeDesc: String?=null,
    @SerialName("documentUrl")
    val documentUrl: String?=null,
    @SerialName("fileName")
    val fileName: String?=null,
    @SerialName("fileType")
    val fileType: String?=null,
    @SerialName("id")
    val id: String?=null,
    @SerialName("objectKey")
    val objectKey: String?=null
)