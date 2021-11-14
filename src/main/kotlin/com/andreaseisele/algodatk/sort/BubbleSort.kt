package com.andreaseisele.algodatk.sort

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class BubbleSort {

    companion object {

        fun sort (array: Array<Int>): Array<Int> {
            var unsortedTil = array.size - 1
            var sorted = false

            while (!sorted) {
                sorted = true
                for (i in 0 until unsortedTil) {
                    if (array[i] > array[i + 1]) {
                        array[i] = array[i + 1].also {array[i + 1] = array[i]}
                        sorted = false
                    }
                }
                unsortedTil--
            }

            logger.debug { "sorted: ${array.joinToString()}" }
            return array;
        }

    }

}