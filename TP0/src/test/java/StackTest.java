import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;

    @BeforeEach
    public void setup() {
        stack = new Stack();
    }

    @Test
    void testPushAndPopWorkCorrectly() {
        // Arrange

        // Already initialized

        // Act
        stack.push(5);
        stack.push(6);
        stack.push(4);

        // Assert
        assertEquals(4, stack.pop());
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPeekReturnsTopElementWithoutRemoving() {
        // Arrange

        // Already initialized

        // Act
        stack.push(35);
        stack.push(11);
        stack.push(7);

        // Assert
        assertEquals(7, stack.peek());
        assertEquals(3, stack.size());
    }

    @Test
    void testPopOnEmptyStackThrowsException() {
        // Arrange

        // Already initialized

        // Act and Assert
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    void testPeekOnEmptyStackThrowsException() {
        // Arrange

        // Already initialized

        // Act and Assert
        assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    void testSizeReturnsCorrectStackSize() {
        // Arrange

        // Already initialized

        // Act
        stack.push(8);
        stack.push(4);
        stack.push(13);
        stack.push(47);
        stack.push(16);

        // Assert
        assertEquals(5, stack.size());
    }

    @Test
    void testIsEmptyReturnsTrueForEmptyStack() {
        // Arrange

        // Already initialized

        // Assert
        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmptyReturnsFalseForNonEmptyStack() {
        // Arrange

        // Already initialized

        // Act
        stack.push(1);

        // Assert
        assertFalse(stack.isEmpty());
    }
}
