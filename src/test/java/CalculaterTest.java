import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorTest {

    @Test
    void sumPositiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(7, calculator.sum(3, 4));
    }

    @Test
    void sumNegativeNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(-7, calculator.sum(-3, -4));
    }

    @Test
    void sumWithZero() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.sum(5, 0));
    }



        @Test
    void subtractPositiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void subtractNegativeNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(-5, calculator.subtract(-10, -5));
    }

    @Test
    void multiplyPositiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void multiplyByZero() {
        Calculator calculator = new Calculator();

        assertEquals(0, calculator.multiply(10, 0));
    }

    @Test
    void multiplyNegativeNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(-20, calculator.multiply(-4, 5));
    }

    @Test
    void dividePositiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void divideNegativeNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(-5, calculator.divide(-10, 2));
    }

    @Test
    void divideByZeroThrowsException() {
        Calculator calculator = new Calculator();

        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }

    @Test
    void evenNumberReturnsTrue() {
        Calculator calculator = new Calculator();

        assertTrue(calculator.isEven(8));
    }

    @Test
    void oddNumberReturnsFalse() {
        Calculator calculator = new Calculator();

        assertFalse(calculator.isEven(7));
    }
}
