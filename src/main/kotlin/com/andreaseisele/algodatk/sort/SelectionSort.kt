package com.andreaseisele.algodatk.sort

class SelectionSort {

    companion object {

        fun sort(array: Array<Int>): Array<Int> {
            for (i in array.indices) {
                var lowestIdx = i;
                for (j in i + 1 until array.size) {
                    if (array[j] < array[lowestIdx]) {
                        lowestIdx = j
                    }
                }
                println("selection for $i = swap ${array[i]} with ${array[lowestIdx]}")
                array[i] = array[lowestIdx].also {array[lowestIdx] = array[i]}
            }

            return array
        }

    }

}