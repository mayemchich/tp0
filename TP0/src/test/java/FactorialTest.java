import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void testFactorialForZero() {
        // Arrange & Act
        int result = Factorial.factorial(0);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void testFactorialForOne() {
        // Arrange & Act
        int result = Factorial.factorial(1);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void testFactorialForPositiveNumbers() {
        // Arrange & Act
        int result2 = Factorial.factorial(2);
        int result3 = Factorial.factorial(3);
        int result4 = Factorial.factorial(4);
        int result5 = Factorial.factorial(5);

        // Assert
        assertEquals(2, result2);
        assertEquals(6, result3);
        assertEquals(24, result4);
        assertEquals(120, result5);
    }

    @Test
    void testFactorialForNegativeNumberThrowsException() {
        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-8));
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-35));
    }
}
