package com.example.kmptestapp.ui.dashboard.home.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kmptestapp.data.network.ApiState
import com.example.kmptestapp.ui.dashboard.home.models.ResponseSurveyorAssessment
import com.example.kmptestapp.ui.dashboard.home.models.products.ResponseProducts
import com.example.kmptestapp.ui.dashboard.home.models.request.Request
import com.example.kmptestapp.ui.dashboard.home.repository.ApiRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(val repo: ApiRepository) : ViewModel() {


    private val responseProducts_ = MutableStateFlow<ApiState<ResponseProducts>>(ApiState.Loading)

    val responseProducts: StateFlow<ApiState<ResponseProducts>> = responseProducts_


    fun getProductsList() {

        viewModelScope.launch {
            repo?.getProducts()
                ?.catch { e ->
                    println("ERROR: ${e.message}")
                }
                ?.collect {
                    responseProducts_.value = it
                }
        }

    }



}