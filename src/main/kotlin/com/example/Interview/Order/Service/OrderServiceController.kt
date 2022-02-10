package com.example.Interview.Order.Service

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class OrderServiceController {
    private val orangeCost = .25
    private val appleCost = .6

    private val orderHistory: List<Order> = listOf()

    @GetMapping("/placeOrder")
    fun placeOrder(items: Array<String>): Order {
        var totalCost = 0.0
        var orangeCount = 0
        var appleCount = 0

        items.forEach{
            when (it.lowercase()) { // lowercase() used to account for the user using weird inputs like "ApPlE" or "oRANgE"
                "orange" -> {
                    orangeCount++
                    if (orangeCount % 3 != 0) {
                        totalCost += orangeCost
                    }
                }
                "apple" -> {
                    appleCount++
                    if (appleCount % 2 != 0) {
                        totalCost += appleCost
                    }
                }
            }
        }



        return Order(orderHistory.size + 1,
                orangeCount,
                appleCount,
                totalCost)
    }


}