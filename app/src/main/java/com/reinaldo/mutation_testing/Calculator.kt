package com.reinaldo.mutation_testing

import kotlin.math.pow

class Calculator(var displayedValue: Double = 0.0) {

    fun add(x: Double) {
        displayedValue += x
    }

    fun subtract(x: Double) {
        displayedValue -= x
    }

    fun power(x: Double) {
        displayedValue = displayedValue.pow(x)
    }

    fun getResult() = displayedValue

    private fun resetValue(x: Double) {
        displayedValue = x
    }
}

