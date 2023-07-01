package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String
)

val customerStorage = mutableListOf(
    Customer(
        id = "1",
        firstName = "Johny",
        lastName = "Doe",
        email = "johny.doe@sample.com"
    ),
    Customer(
        id = "2",
        firstName = "Jane",
        lastName = "Doe",
        email = "jane.doe@sample.com"
    ),
    Customer(
        id = "3",
        firstName = "Anna",
        lastName = "Malli",
        email = "anna.malli@sample.com"
    ),
    Customer(
        id = "4",
        firstName = "Peter",
        lastName = "Parker",
        email = "peter.parker@sample.com"
    ),
    Customer(
        id = "5",
        firstName = "Orgrim",
        lastName = "Doomhammer",
        email = "orgrim.doomhammer@sample.com"
    ),
    Customer(
        id = "6",
        firstName = "Jaina",
        lastName = "Proudmoore",
        email = "jaina.proudmoore@sample.com"
    ),
)
