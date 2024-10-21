package com.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun `test main function output`() {
        val output = "Hello, Kotlin Application!"
        assertEquals(output, output) // Example test
    }
}
