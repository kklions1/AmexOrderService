package com.example.Interview.Order.Service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OrderServiceControllerTest {

    @Test
    fun appleCostsCorrectAmount() {
        val result = OrderServiceController().getCost(arrayOf("Apple"))
        assertEquals(.60, result)
    }

    @Test
    fun orangeCostsCorrectAmount() {
        val result = OrderServiceController().getCost(arrayOf("Orange"))
        assertEquals(.25, result)
    }

    @Test
    fun orderServiceReturnsCorrectTotalCost() {
        val result = OrderServiceController().getCost(arrayOf("apple", "apple", "orange"))
        assertEquals(.85, result)
    }

    @Test
    fun buyOneGetOneFreeApplesWhenEvenApples() {
        val result = OrderServiceController().getCost(arrayOf("Apple", "apple"))
        assertEquals(.6, result)
    }

    @Test
    fun buyOneGetOneFreeApplesWhenOddApples() {
        val result = OrderServiceController().getCost(arrayOf("Apple", "apple", "apple"))
        assertEquals(1.2, result)
    }

    @Test
    fun threeForThePriceOfTwoOranges() {
        val result = OrderServiceController().getCost(arrayOf("orange", "orange", "Orange"))
        assertEquals(.5, result)
    }

}