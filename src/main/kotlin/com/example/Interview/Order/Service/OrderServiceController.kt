package com.example.Interview.Order.Service

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class OrderServiceController {
    private val orangeCost = .25
    private val appleCost = .6

    @GetMapping("/")
    fun getCost(items: Array<String>): Double {
        var totalCost = 0.0

        items.forEach{
            when (it.lowercase()) {
                "orange" -> {
                    totalCost += orangeCost
                }
                "apple" -> {
                    totalCost += appleCost
                }
            }
        }

        return totalCost
    }


}