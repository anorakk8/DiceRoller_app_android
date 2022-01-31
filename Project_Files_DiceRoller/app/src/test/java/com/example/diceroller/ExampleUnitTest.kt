package com.example.diceroller

import junit.framework.Assert.assertTrue
import org.junit.Test


class ExampleUnitTest {
    @Test
    fun generatesNumber()
    {
    val dice=Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of roll was not b/w 1 and 6", rollResult in 1..6)

    }
}