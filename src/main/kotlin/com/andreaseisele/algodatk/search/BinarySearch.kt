package com.andreaseisele.algodatk.search

class BinarySearch {

    companion object {

        fun find(array: Array<Int>, value: Int): Int? {
            var lowerBound = 0
            var upperBound = array.size

            while (lowerBound < upperBound) {
                val middlePoint = (lowerBound + upperBound) / 2
                println("lower $middlePoint, upper $upperBound, middle $middlePoint")
                val middleValue = array[middlePoint]
                when {
                    middleValue == value -> {
                        return middlePoint
                    }
                    middleValue < value -> {
                        lowerBound = middlePoint + 1
                    }
                    else -> {
                        upperBound = middlePoint - 1
                    }
                }
            }

            return null
        }

    }

}