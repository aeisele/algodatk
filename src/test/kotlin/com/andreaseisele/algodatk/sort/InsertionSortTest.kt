package com.andreaseisele.algodatk.sort

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldBeSorted
import io.kotest.property.Arb
import io.kotest.property.arbitrary.int
import io.kotest.property.arbitrary.intArray
import io.kotest.property.checkAll

class InsertionSortTest : StringSpec({

    "should sort array in ascending order" {
        checkAll(Arb.intArray(Arb.int(5, 15), Arb.int())) { array ->
            InsertionSort.sort(array.toTypedArray()).shouldBeSorted()
        }
    }

})