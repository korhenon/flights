package com.example.flights.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.flights.R

@OptIn(ExperimentalTextApi::class)
val inter = FontFamily(
    Font(
        R.font.inter,
        weight = FontWeight.Normal,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(FontWeight.Normal.weight)
        )
    ),
    Font(
        R.font.inter,
        weight = FontWeight.Medium,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(FontWeight.Medium.weight)
        )
    ),
    Font(
        R.font.inter,
        weight = FontWeight.SemiBold,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(FontWeight.SemiBold.weight)
        )
    ),
    Font(
        R.font.inter,
        weight = FontWeight.Bold,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(FontWeight.Bold.weight)
        )
    ),
)

// Set of Material typography styles to start with
fun createFlightsTypography(textColor: Color) = FlightsTypography(
    textXs = TextStyle(
        fontFamily = inter,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        color = textColor
    ),
    textSm = TextStyle(
        fontFamily = inter,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        color = textColor
    ),
    textMd = TextStyle(
        fontFamily = inter,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = textColor
    ),
    textLg = TextStyle(
        fontFamily = inter,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        color = textColor
    ),
    textXl = TextStyle(
        fontFamily = inter,
        fontSize = 20.sp,
        lineHeight = 30.sp,
        color = textColor
    ),
    displayXs = TextStyle(
        fontFamily = inter,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        color = textColor
    ),
    displaySm = TextStyle(
        fontFamily = inter,
        fontSize = 30.sp,
        lineHeight = 38.sp,
        color = textColor
    ),
    displayMd = TextStyle(
        fontFamily = inter,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        color = textColor
    ),
    displayLg = TextStyle(
        fontFamily = inter,
        fontSize = 48.sp,
        lineHeight = 60.sp,
        color = textColor
    ),
    displayXl = TextStyle(
        fontFamily = inter,
        fontSize = 60.sp,
        lineHeight = 72.sp,
        color = textColor
    ),
    display2xl = TextStyle(
        fontFamily = inter,
        fontSize = 72.sp,
        lineHeight = 90.sp,
        color = textColor
    )
)