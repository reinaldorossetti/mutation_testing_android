package com.reinaldo.mutation_testing.division

import com.reinaldo.mutation_testing.Calculator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Assertions.assertEquals

/**
 * Classe para Testar a nossa calculadora, estou usando o junit 5, agora precisando colocar o delta
 */

class CalculatorDivision {

    @Test
    @DisplayName("Testando a funcao de divisao")
    fun testDivision() {
        val calculator = Calculator()
        calculator.division(10.0, 2.0)
        assertEquals(
            5.0 , calculator.getResult(), 3.0
        )
    }

}