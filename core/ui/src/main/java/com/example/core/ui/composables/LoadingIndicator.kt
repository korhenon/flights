package com.example.core.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.core.ui.theme.FlightsTheme

@Composable
internal fun LoadingIndicator(modifier: Modifier = Modifier) {
    Box(
        Modifier
            .fillMaxSize()
            .background(FlightsTheme.colors.loadingShadow)
            .then(modifier),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(color = FlightsTheme.colors.primary)
    }
}

@Preview
@Composable
private fun LoadingIndicatorPreview() {
    FlightsTheme {
        Surface(color = FlightsTheme.colors.background) {
            LoadingIndicator()
        }
    }
}