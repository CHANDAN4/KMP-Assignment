package com.example.kmptestapp.ui.dashboard.home.repository

import com.example.kmptestapp.data.network.ApiService
import com.example.kmptestapp.data.network.ApiState
import com.example.kmptestapp.ui.dashboard.home.models.products.ResponseProducts
import com.example.kmptestapp.ui.dashboard.home.models.request.Request
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class ApiRepository(
    private val apiService: ApiService
) {


    fun getProducts() :  Flow<ApiState<ResponseProducts>> = flow {

        emit(ApiState.Loading)

        try {

            //val encrypted = Utility().callEncryption(request)
            val response = apiService.getProducts()
            if(response.products.isNotEmpty()) {
                //insertModeOfTransit(response)
                emit(ApiState.Success(response))
            } else {
                emit(ApiState.Empty)
            }

        } catch (e: Exception) {
            emit(ApiState.Error(e.message ?: "Unknown Error"))
        }

    }.flowOn(Dispatchers.IO)




}