package com.andreaseisele.algodatk.search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class BinarySearchTest {

    @Test
    internal fun testFind() {
        val found = BinarySearch.find(arrayOf(1, 20, 58, 303, 1023), 58)

        assertEquals(2, found)
    }

    @Test
    internal fun testFindNot() {
        val notFound = BinarySearch.find(arrayOf(1, 20, 58, 303, 1023), 5)

        assertNull(notFound)
    }
}

