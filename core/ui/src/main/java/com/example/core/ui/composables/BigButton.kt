package com.example.core.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.core.ui.theme.FlightsTheme
import com.example.core.ui.utills.ButtonShape
import com.example.core.ui.utills.ButtonVariant

@Composable
fun BigButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    variant: ButtonVariant = ButtonVariant.Primary,
    shape: ButtonShape = ButtonShape.RoundedRectangle,
    content: @Composable () -> Unit
) {
    BaseButton(
        onClick = onClick,
        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 12.dp),
        modifier = modifier,
        enabled = enabled,
        variant = variant,
        shape = shape,
        content = content
    )
}

@Preview
@Composable
private fun BigButtonPreview() {
    FlightsTheme {
        Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                BigButton(
                    onClick = {},
                    enabled = true,
                    variant = ButtonVariant.Primary,
                    shape = ButtonShape.RoundedRectangle
                ) {
                    Text(text = "Button")
                }
                BigButton(
                    onClick = {},
                    enabled = true,
                    variant = ButtonVariant.Primary,
                    shape = ButtonShape.Rounded
                ) {
                    Text(text = "Button")
                }
                BigButton(
                    onClick = {},
                    enabled = true,
                    variant = ButtonVariant.Outline,
                    shape = ButtonShape.RoundedRectangle
                ) {
                    Text(text = "Button")
                }
                BigButton(
                    onClick = {},
                    enabled = true,
                    variant = ButtonVariant.Outline,
                    shape = ButtonShape.Rounded
                ) {
                    Text(text = "Button")
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                BigButton(
                    onClick = {},
                    enabled = false,
                    variant = ButtonVariant.Primary,
                    shape = ButtonShape.RoundedRectangle
                ) {
                    Text(text = "Button")
                }
                BigButton(
                    onClick = {},
                    enabled = false,
                    variant = ButtonVariant.Primary,
                    shape = ButtonShape.Rounded
                ) {
                    Text(text = "Button")
                }
                BigButton(
                    onClick = {},
                    enabled = false,
                    variant = ButtonVariant.Outline,
                    shape = ButtonShape.RoundedRectangle
                ) {
                    Text(text = "Button")
                }
                BigButton(
                    onClick = {},
                    enabled = false,
                    variant = ButtonVariant.Outline,
                    shape = ButtonShape.Rounded
                ) {
                    Text(text = "Button")
                }
            }
        }
    }
}