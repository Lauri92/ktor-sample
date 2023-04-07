package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Order(
    val number: String,
    val contents: List<OrderItem>
)

@Serializable
data class OrderItem(
    val item: String,
    val amount: Int,
    val price: Double
)

val orderStorage = listOf(
    Order(
        number = "2020-04-06-01", contents = listOf(
            OrderItem(item = "Ham Sandwich", amount = 2, price = 5.50),
            OrderItem(item = "Water", amount = 1, price = 1.50),
            OrderItem(item = "Beer", amount = 3, price = 2.30),
            OrderItem(item = "Cheesecake", amount = 1, price = 3.75)
        )
    ),
    Order(
        number = "2020-04-03-01", contents = listOf(
            OrderItem(item = "Cheeseburger", amount = 1, price = 8.50),
            OrderItem(item = "Water", amount = 2, price = 1.50),
            OrderItem(item = "Coke", amount = 2, price = 1.76),
            OrderItem(item = "Ice Cream", amount = 1, price = 2.35)
        )
    )
)