package com.example.core.ui.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.core.ui.utills.InternetState

@Composable
public fun InternetStateIndicator(state: InternetState, modifier: Modifier = Modifier) {
    when (state) {
        InternetState.Loading -> LoadingIndicator(modifier)
        is InternetState.NoInternet -> NoInternetModal(onTryAgain = state.callback, modifier)
        InternetState.Success -> Unit
    }
}