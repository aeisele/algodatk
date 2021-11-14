package com.andreaseisele.algodatk.sort

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class InsertionSort {

    companion object {

        fun sort(array: Array<Int>): Array<Int> {

            for (i in 1 until array.size) {
                var gapIdx = i
                val value = array[i]
                for (j in i - 1 downTo 0) {
                    if (array[j] > value) {
                        gapIdx = j
                        array[j] = array[j+1].also { array[j+1] = array[j] }
                        continue
                    }
                    array[gapIdx] = value
                    break
                }
            }

            logger.debug { "sorted: ${array.joinToString()}" }
            return array
        }

    }

}