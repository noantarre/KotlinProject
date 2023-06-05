package com.example.kotlinproject.sampledata

import com.example.kotlinproject.R
import com.example.kotlinproject.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("12.99"),
        image = R.drawable.burger
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("19.99"),
        image = R.drawable.pizza
    ),
    Product(
        name = "Batata frita",
        price = BigDecimal("7.99"),
        image = R.drawable.fries
    ),
    Product(
        name = "Açaí",
        price = BigDecimal("16.99"),
        image = R.drawable.acai
    )
)
