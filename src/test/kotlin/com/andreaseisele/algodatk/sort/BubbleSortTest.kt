package com.andreaseisele.algodatk.sort

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test


internal class BubbleSortTest {

    @Test
    internal fun testSort() {
        val sorted = BubbleSort.sort(arrayOf(7, 3, 15, 2, 1))
        val expected = arrayOf(1, 2, 3, 7, 15)

        assertArrayEquals(expected, sorted)
    }

    @Test
    internal fun testSortEmpty() {
        val sorted = BubbleSort.sort(arrayOf())
        assertArrayEquals(arrayOf(), sorted)
    }
}