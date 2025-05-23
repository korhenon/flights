package com.example.flights.ui.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.flights.ui.theme.FlightsTheme
import com.example.flights.ui.utils.ButtonShape
import com.example.flights.ui.utils.ButtonVariant

@Composable
fun BaseButton(
    onClick: () -> Unit,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    variant: ButtonVariant = ButtonVariant.Primary,
    shape: ButtonShape = ButtonShape.RoundedRectangle,
    content: @Composable () -> Unit
) {
    Button(
        onClick = onClick,
        contentPadding = contentPadding,
        enabled = enabled,
        shape = when (shape) {
            ButtonShape.RoundedRectangle -> RoundedCornerShape(8.dp)
            ButtonShape.Rounded -> CircleShape
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = when (variant) {
                ButtonVariant.Primary -> FlightsTheme.colors.primary
                ButtonVariant.Outline -> FlightsTheme.colors.background
            },
            contentColor = when (variant) {
                ButtonVariant.Primary -> FlightsTheme.colors.onPrimary
                ButtonVariant.Outline -> FlightsTheme.colors.primary
            },
            disabledContainerColor = when (variant) {
                ButtonVariant.Primary -> FlightsTheme.colors.primary100
                ButtonVariant.Outline -> FlightsTheme.colors.background
            },
            disabledContentColor = when (variant) {
                ButtonVariant.Primary -> FlightsTheme.colors.primary400
                ButtonVariant.Outline -> FlightsTheme.colors.primary200
            },
        ),
        border = if (variant == ButtonVariant.Outline) BorderStroke(
            width = 1.dp,
            color = if (enabled) FlightsTheme.colors.primary else FlightsTheme.colors.primary100
        ) else null,
        modifier = modifier
    ) {
        content()
    }
}