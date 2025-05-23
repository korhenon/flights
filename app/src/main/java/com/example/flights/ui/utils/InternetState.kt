package com.example.flights.ui.utils

sealed interface InternetState {
    data object Loading : InternetState
    data object Success : InternetState
    data class NoInternet(
        val callback: () -> Unit
    ) : InternetState
}
