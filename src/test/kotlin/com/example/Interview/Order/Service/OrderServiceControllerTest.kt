package com.example.Interview.Order.Service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OrderServiceControllerTest {
    private val orderServiceController = OrderServiceController()

    @Test
    fun appleCostsCorrectAmount() {
        val result = orderServiceController.placeOrder(arrayOf("Apple"))
        assertEquals(.60, result.totalCost)
    }

    @Test
    fun orangeCostsCorrectAmount() {
        val result = orderServiceController.placeOrder(arrayOf("Orange"))
        assertEquals(.25, result.totalCost)
    }

    @Test
    fun orderServiceReturnsCorrectTotalCost() {
        val result = orderServiceController.placeOrder(arrayOf("apple", "apple", "orange"))
        assertEquals(.85, result.totalCost)
    }

    @Test
    fun buyOneGetOneFreeApplesWhenEvenApples() {
        val result = orderServiceController.placeOrder(arrayOf("Apple", "apple"))
        assertEquals(.6, result.totalCost)
    }

    @Test
    fun buyOneGetOneFreeApplesWhenOddApples() {
        val result = orderServiceController.placeOrder(arrayOf("Apple", "apple", "apple"))
        assertEquals(1.2, result.totalCost)
    }

    @Test
    fun threeForThePriceOfTwoOranges() {
        val result = orderServiceController.placeOrder(arrayOf("orange", "orange", "Orange"))
        assertEquals(.5, result.totalCost)
    }

}