package com.example.core.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.core.ui.R
import com.example.core.ui.theme.FlightsTheme
import com.example.core.ui.utills.ButtonVariant

@Composable
internal fun NoInternetModal(onTryAgain: () -> Unit, modifier: Modifier = Modifier) {
    Box(
        Modifier
            .fillMaxSize()
            .background(FlightsTheme.colors.primary)
            .then(modifier),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.ic_wifi_square),
                contentDescription = "No internet icon",
                Modifier.size(120.dp)
            )
            Spacer(Modifier.height(24.dp))
            Text(
                text = stringResource(R.string.no_internet_title),
                fontWeight = FontWeight.SemiBold,
                style = FlightsTheme.typography.displayXs,
                color = FlightsTheme.colors.onPrimary
            )
            Spacer(Modifier.height(12.dp))
            Text(
                text = stringResource(R.string.no_internet_text),
                style = FlightsTheme.typography.textMd,
                color = FlightsTheme.colors.onPrimarySubText,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp)
            )
        }
        BigButton(
            onClick = onTryAgain,
            variant = ButtonVariant.Outline,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, bottom = 16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.no_internet_try_again),
                fontWeight = FontWeight.Medium,
                style = FlightsTheme.typography.textMd
            )
        }
    }
}