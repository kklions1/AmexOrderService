package com.example.Interview.Order.Service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OrderServiceControllerTest {

    @Test
    fun orderServiceReturnsCorrectTotalCost() {
        val result = OrderServiceController().getCost(arrayOf("apple", "apple", "orange"))
        assertEquals(1.45, result)
    }
}