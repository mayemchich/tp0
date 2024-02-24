import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFibonacciThrowsExceptionForNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-5));
    }

    @Test
    void testFibonacciReturnsZeroForZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void testFibonacciReturnsOneForOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void testFibonacciReturnsCorrectValuesForNumbersGreaterThanOne() {
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
        // We can continue this verification as much as we want !!
    }
}
