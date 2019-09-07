package com.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

internal class HelloTest {

    @Test
    fun `test get`() {
        val hello = Hello()
        assertAll(
                { assertEquals(hello.get("World"), "Hello World") },
                { assertEquals(hello.get("Bob"), "Hello Bob") }
        )
    }
}
