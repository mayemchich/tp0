import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGetFullNameReturnsCorrectFullName() {
        // Arrange
        Person person = new Person("Mebarkia", "Turki", 23);

        // Act
        String fullName = person.getFullName();

        // Assert
        assertEquals("Mebarkia Turki", fullName);
    }

    @Test
    void testIsAdultReturnsTrueForAdultPerson() {
        // Arrange
        Person adultPerson = new Person("Mebarkia", "Ameur", 21);

        // Act
        boolean isAdult = adultPerson.isAdult();

        // Assert
        assertTrue(isAdult);
    }

    @Test
    void testIsAdultReturnsFalseForNonAdultPerson() {
        // Arrange
        Person nonAdultPerson = new Person("Cristiano", "Ronaldo", 17);

        // Act
        boolean isAdult = nonAdultPerson.isAdult();

        // Assert
        assertFalse(isAdult);
    }
}
