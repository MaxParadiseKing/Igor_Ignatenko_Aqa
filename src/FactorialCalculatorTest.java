import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculatorTest {

    @Test
    public void testIterativeFactorial() {
        FactorialCalculator FactorialCalculator = null;
        assertEquals(FactorialCalculator.iterativeFactorial(0), 1);  // 0!
        assertEquals(FactorialCalculator.iterativeFactorial(1), 1);  // 1!
        assertEquals(FactorialCalculator.iterativeFactorial(2), 2);  // 2!
        assertEquals(FactorialCalculator.iterativeFactorial(3), 6);  // 3!
        assertEquals(FactorialCalculator.iterativeFactorial(4), 24); // 4!
        assertEquals(FactorialCalculator.iterativeFactorial(5), 120); // 5!
        assertEquals(FactorialCalculator.iterativeFactorial(6), 720); // 6!
        assertEquals(FactorialCalculator.iterativeFactorial(7), 5040); // 7!
    }

    @Test
    public void testRecursiveFactorial() {
        assertEquals(FactorialCalculator.recursiveFactorial(0), 1);  // 0!
        assertEquals(FactorialCalculator.recursiveFactorial(1), 1);  // 1!
        assertEquals(FactorialCalculator.recursiveFactorial(2), 2);  // 2!
        assertEquals(FactorialCalculator.recursiveFactorial(3), 6);  // 3!
        assertEquals(FactorialCalculator.recursiveFactorial(4), 24); // 4!
        assertEquals(FactorialCalculator.recursiveFactorial(5), 120); // 5!
        assertEquals(FactorialCalculator.recursiveFactorial(6), 720); // 6!
        assertEquals(FactorialCalculator.recursiveFactorial(7), 5040); // 7!
    }

    @Test
    public void testNegativeFactorial() {
        // Проверяем, будет ли выдано исключение при вводе отрицательного числа.
        // В текущей версии отсутствует выбрасывание исключений, но если вы добавите его, то тест будет выглядеть так:
        FactorialCalculator FactorialCalculator = null;
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.iterativeFactorial(-1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.recursiveFactorial(-1);
        });
    }
}
