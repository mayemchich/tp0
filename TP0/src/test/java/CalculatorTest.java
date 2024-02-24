import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddMethodReturnsCorrectSum() {
        // Arrange
        Calculator calculator = new Calculator();
        int operand1 = 2;
        int operand2 = 3;
        int expectedSum = 5;

        // Act 
        int actualSum = calculator.add(operand1, operand2);

        // Assert 
        assertEquals(expectedSum, actualSum, "Addition result is incorrect");
    }
}
