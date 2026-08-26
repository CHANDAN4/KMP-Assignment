package com.example.kmptestapp.koin


import com.example.kmptestapp.data.network.ApiService
import com.example.kmptestapp.data.network.createHttpClient
import com.example.kmptestapp.ui.dashboard.home.repository.ApiRepository
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel
import com.example.kmptestapp.ui.dashboard.profile.viewModel.ProfileViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { createHttpClient() }

    single { ApiService(get()) }

    single { ApiRepository(get()) }

    factory { HomeViewModel(get()) }

    factory { ProfileViewModel(get()) }

}