package com.example.core.ui.utills

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import com.example.core.common.PhoneNumberFormatter
import kotlin.math.max

class PhoneNumberVisualTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val out = PhoneNumberFormatter(text.text)
        return TransformedText(
            AnnotatedString(out.formatted),
            buildOffsetMapping(out.countryCode?.length)
        )
    }

    private fun buildOffsetMapping(countryCodeLength: Int?): OffsetMapping {
        return object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                if (countryCodeLength == null) {
                    return max(1, offset + 1)
                }
                return when (offset) {
                    in 0..countryCodeLength -> max(1, offset + 1)
                    in (countryCodeLength + 1)..(countryCodeLength + 3) -> offset + 2
                    in (countryCodeLength + 4)..(countryCodeLength + 6) -> offset + 3
                    in (countryCodeLength + 7)..(countryCodeLength + 8) -> offset + 4
                    else -> offset + 5
                }
            }

            override fun transformedToOriginal(offset: Int): Int {
                if (countryCodeLength == null) {
                    return max(0, offset - 1)
                }
                return when (offset) {
                    in 0..(countryCodeLength + 1) -> max(1, offset - 1)
                    in (countryCodeLength + 2)..(countryCodeLength + 5) -> offset - 2
                    in (countryCodeLength + 6)..(countryCodeLength + 9) -> offset - 3
                    in (countryCodeLength + 10)..(countryCodeLength + 12) -> offset - 4
                    else -> offset - 5
                }
            }

        }
    }
}