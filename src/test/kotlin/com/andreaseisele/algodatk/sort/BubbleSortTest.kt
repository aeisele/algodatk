package com.andreaseisele.algodatk.sort

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldBeSorted
import io.kotest.property.Arb
import io.kotest.property.arbitrary.int
import io.kotest.property.arbitrary.intArray
import io.kotest.property.checkAll


class BubbleSortTest : StringSpec({

    "should sort int array ascending" {
        checkAll(Arb.intArray(Arb.int(5, 15), Arb.int())) { array ->
            BubbleSort.sort(array.toTypedArray()).shouldBeSorted()
        }
    }

})