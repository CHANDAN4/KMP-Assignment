package com.example.kmptestapp.data.network

import com.example.kmptestapp.ui.dashboard.home.models.ResponseSurveyorAssessment
import com.example.kmptestapp.ui.dashboard.home.models.products.ResponseProducts
import com.example.kmptestapp.ui.dashboard.home.models.request.Request
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody

class ApiService( private val client: HttpClient) {


    suspend fun getProducts(): ResponseProducts {

        return client.get(ApiRoute.SUR_ASSESS).body()

    }


}