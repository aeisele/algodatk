package com.andreaseisele.algodatk.sort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SelectionSortTest {

    @Test
    fun testSort() {
        val sorted = SelectionSort.sort(arrayOf(4, 2, 7, 1, 3))
        val expected = arrayOf(1, 2, 3, 4, 7)

        assertArrayEquals(expected, sorted)
    }

    @Test
    fun testEmpty() {
        val sorted = SelectionSort.sort(arrayOf())

        assertArrayEquals(arrayOf(), sorted)
    }

}

