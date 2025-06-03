package com.example.core.ui.utills

public sealed interface InternetState {
    data object Loading : InternetState
    data object Success : InternetState
    data class NoInternet(
        val callback: () -> Unit
    ) : InternetState
}
