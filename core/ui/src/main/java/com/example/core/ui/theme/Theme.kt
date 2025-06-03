package com.example.core.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Immutable
data class FlightsColors(
    val primary: Color,
    val primary100: Color,
    val primary200: Color,
    val primary400: Color,
    val background: Color,
    val error: Color,
    val warning: Color,
    val success: Color,
    val onBackground: Color,
    val loadingShadow: Color,
    val onPrimary: Color,
    val onPrimarySubText: Color
)

@Immutable
data class FlightsTypography(
    val textXs: TextStyle,
    val textSm: TextStyle,
    val textMd: TextStyle,
    val textLg: TextStyle,
    val textXl: TextStyle,
    val displayXs: TextStyle,
    val displaySm: TextStyle,
    val displayMd: TextStyle,
    val displayLg: TextStyle,
    val displayXl: TextStyle,
    val display2xl: TextStyle
)

val LocalFlightsColors = staticCompositionLocalOf {
    FlightsColors(
        primary = Color.Unspecified,
        primary100 = Color.Unspecified,
        primary200 = Color.Unspecified,
        primary400 = Color.Unspecified,
        background = Color.Unspecified,
        error = Color.Unspecified,
        warning = Color.Unspecified,
        success = Color.Unspecified,
        onBackground = Color.Unspecified,
        loadingShadow = Color.Unspecified,
        onPrimary = Color.Unspecified,
        onPrimarySubText = Color.Unspecified
    )
}

val LocalFlightsTypography = staticCompositionLocalOf {
    FlightsTypography(
        textXs = TextStyle.Default,
        textSm = TextStyle.Default,
        textMd = TextStyle.Default,
        textLg = TextStyle.Default,
        textXl = TextStyle.Default,
        displayXs = TextStyle.Default,
        displaySm = TextStyle.Default,
        displayMd = TextStyle.Default,
        displayLg = TextStyle.Default,
        displayXl = TextStyle.Default,
        display2xl = TextStyle.Default
    )
}

@Composable
fun FlightsTheme(content: @Composable () -> Unit) {
    val colors = FlightsColors(
        primary = Primary,
        primary100 = Primary100,
        primary200 = Primary200,
        primary400 = Primary400,
        background = Color.White,
        error = Error,
        warning = Warning,
        success = Success,
        onBackground = Gray800,
        loadingShadow = LightLoadingShadow,
        onPrimary = Color.White,
        onPrimarySubText = Gray100
    )
    CompositionLocalProvider(
        LocalFlightsColors provides colors,
        LocalFlightsTypography provides Typography,
        content = content
    )
}

object FlightsTheme {
    val colors: FlightsColors
        @Composable
        get() = LocalFlightsColors.current
    val typography: FlightsTypography
        @Composable
        get() = LocalFlightsTypography.current
}