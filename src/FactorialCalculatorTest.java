import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FactorialCalculatorTest {

    @Test
    public void testIterativeFactorial() {
        assertEquals(1, FactorialCalculator.iterativeFactorial(0));  // 0!
        assertEquals(1, FactorialCalculator.iterativeFactorial(1));  // 1!
        assertEquals(2, FactorialCalculator.iterativeFactorial(2));  // 2!
        assertEquals(6, FactorialCalculator.iterativeFactorial(3));  // 3!
        assertEquals(24, FactorialCalculator.iterativeFactorial(4)); // 4!
        assertEquals(120, FactorialCalculator.iterativeFactorial(5)); // 5!
        assertEquals(720, FactorialCalculator.iterativeFactorial(6)); // 6!
        assertEquals(5040, FactorialCalculator.iterativeFactorial(7)); // 7!
    }

    @Test
    public void testRecursiveFactorial() {
        assertEquals(1, FactorialCalculator.recursiveFactorial(0));  // 0!
        assertEquals(1, FactorialCalculator.recursiveFactorial(1));  // 1!
        assertEquals(2, FactorialCalculator.recursiveFactorial(2));  // 2!
        assertEquals(6, FactorialCalculator.recursiveFactorial(3));  // 3!
        assertEquals(24, FactorialCalculator.recursiveFactorial(4)); // 4!
        assertEquals(120, FactorialCalculator.recursiveFactorial(5)); // 5!
        assertEquals(720, FactorialCalculator.recursiveFactorial(6)); // 6!
        assertEquals(5040, FactorialCalculator.recursiveFactorial(7)); // 7!
    }

    @Test
    public void testNegativeFactorial() {
        // Для проверки отрицательных значений можно использовать исключение,
        // оно не будет обрабатываться в текущей реализации, но это следует учитывать.
        // Здесь просто демонстрируется, как можно отловить исключение, если бы оно было.
        Exception exception = null;
        try {
            FactorialCalculator.iterativeFactorial(-1);
        } catch (IllegalArgumentException e) {
            exception = e;
        }
        assertNotNull(exception, "Факториал отрицательного числа должен вызывать исключение.");
    }
}
