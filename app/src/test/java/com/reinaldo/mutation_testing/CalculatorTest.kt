package com.reinaldo.mutation_testing

import com.reinaldo.mutation_testing.Calculator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Assertions.assertEquals

/**
 * Classe para Testar a nossa calculadora, estou usando o junit 5, agora precisando colocar o delta
 */

class CalculatorTest {

    @Test
    @DisplayName("Testando a funcao soma")
    fun testAddition() {
        val calculator = Calculator()
        calculator.add(2.0)
        assertEquals(
            2.0 , calculator.getResult(), 3.0
        )
    }

    @Test
    @DisplayName("Testando a funcao subtracao")
    fun testSubtraction() {
        val calculator = Calculator(5.0)
        calculator.subtract(2.0)
        assertEquals(
             3.0, calculator.getResult(), 3.0
        )
    }

    @Test
    @DisplayName("Testando a funcao de potencia")
    fun testPower() {
        val calculator = Calculator(displayedValue = 2.0)
        calculator.power(3.0)
        assertEquals(
            8.0, calculator.getResult(), 3.0
        )
    }

}