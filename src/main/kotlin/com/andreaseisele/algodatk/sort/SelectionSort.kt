package com.andreaseisele.algodatk.sort

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class SelectionSort {

    companion object {

        fun sort(array: Array<Int>): Array<Int> {
            for (i in 0 until array.size - 1) { // last index will be sorted already
                var lowestIdx = i
                for (j in i + 1 until array.size) {
                    if (array[j] < array[lowestIdx]) {
                        lowestIdx = j
                    }
                }
                logger.debug { "selection for $i = swap ${array[i]} with ${array[lowestIdx]}" }
                array[i] = array[lowestIdx].also {array[lowestIdx] = array[i]}
            }

            return array
        }

    }

}