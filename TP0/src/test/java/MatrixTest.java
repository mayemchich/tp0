import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    void testSetAndGetWorksCorrectly() {
        // Arrange
        Matrix matrix = new Matrix(3);

        // Act
        matrix.set(2, 2, 8);

        // Assert
        assertEquals(8, matrix.get(2, 2));
    }

    @Test
    void testAddWorksCorrectly() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(2);

        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        // Act
        matrix1.add(matrix2);

        // Assert
        assertEquals(6, matrix1.get(0, 0));
        assertEquals(8, matrix1.get(0, 1));
        assertEquals(10, matrix1.get(1, 0));
        assertEquals(12, matrix1.get(1, 1));
    }

    @Test
    void testAddThrowsExceptionForDifferentSizes() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(6);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> matrix1.add(matrix2));
    }

    @Test
    void testMultiplyWorksCorrectly() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(2);

        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 0);
        matrix1.set(1, 0, 1);
        matrix1.set(1, 1, 0);

        matrix2.set(0, 0, 1);
        matrix2.set(0, 1, 0);
        matrix2.set(1, 0, 1);
        matrix2.set(1, 1, 0);

        // Act
        matrix1.multiply(matrix2);

        // Assert
        assertEquals(1, matrix1.get(0, 0));
        assertEquals(0, matrix1.get(0, 1));
        assertEquals(1, matrix1.get(1, 0));
        assertEquals(0, matrix1.get(1, 1));
    }

    @Test
    void testMultiplyThrowsExceptionForDifferentSizes() {
        // Arrange
        Matrix matrix1 = new Matrix(5);
        Matrix matrix2 = new Matrix(3);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> matrix1.multiply(matrix2));
    }

    @Test
    void testTransposeWorksCorrectly() {
        // Arrange
        Matrix matrix = new Matrix(2);

        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        // Act
        matrix.transpose();

        // Assert
        assertEquals(1, matrix.get(0, 0));
        assertEquals(3, matrix.get(0, 1));
        assertEquals(2, matrix.get(1, 0));
        assertEquals(4, matrix.get(1, 1));
    }

    @Test
    void testToStringReturnsFormattedString() {
        // Arrange
        Matrix matrix = new Matrix(2);

        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        // Act
        String result = matrix.toString();

        // Assert
        assertEquals("[1, 2]\n[3, 4]\n", result);
    }


    @Test
    void testAddThrowsExceptionForNullMatrix() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> matrix1.add(matrix2));
    }

    @Test
    void testMultiplyThrowsExceptionForNullMatrix() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> matrix1.multiply(matrix2));
    }

    @Test
    void testTransposeThrowsExceptionForNullMatrix() {
        // Arrange
        Matrix matrix = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> matrix.transpose());
    }

    @Test
    void testToStringThrowsExceptionForNullMatrix() {
        // Arrange
        Matrix matrix = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> matrix.toString());
    }
}
