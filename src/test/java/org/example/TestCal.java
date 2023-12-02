package org.example;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestCal {
    private Calculadora calculadora;

    @BeforeEach
    public void setCalculadora() {
        calculadora = new Calculadora();
    }

    @Test
    public void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(5, 0);
        });
    }
}

class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int diminuir(int a, int b) {
        return a - b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é possível ");
        }
        return a / b;
    }
}