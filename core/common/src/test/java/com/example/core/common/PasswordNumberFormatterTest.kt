package com.example.core.common

import org.junit.Assert.assertEquals
import org.junit.Test

class PasswordNumberFormatterTest {
    @Test
    fun isRightFormat() {
        val format = PhoneNumberFormatter("79998883344")
        assertEquals(format.formatted, "+7 999 888 33 44")
    }

    @Test
    fun isCorrectCountryCode() {
        val format = PhoneNumberFormatter("79998883344")
        assertEquals(format.countryCode, "7")
    }

    @Test
    fun isIncorrectCountryCodeNull() {
        val format = PhoneNumberFormatter("2149998883344")
        assertEquals(format.countryCode, null)
    }

    @Test
    fun validationLessSymbols() {
        val format = PhoneNumberFormatter("799988833")
        assert(!format.isCorrectPhoneNumber)
    }

    @Test
    fun validationMoreSymbols() {
        val format = PhoneNumberFormatter("799988833444")
        assert(!format.isCorrectPhoneNumber)
    }

    @Test
    fun validationIncorrectCountryCode() {
        val format = PhoneNumberFormatter("2149998883344")
        assert(!format.isCorrectPhoneNumber)
    }

    @Test
    fun validationCorrect() {
        val format = PhoneNumberFormatter("79998883344")
        assert(format.isCorrectPhoneNumber)
    }
}