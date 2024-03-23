package BranchCoverageTest;

import exercice06.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {

    @Test
    void testFizzBuzzShouldReturnFizzBuzzForMultipleOfThreeAndFive() {
        // Arrange
        int n = 15;
        String expected = "FizzBuzz";

        // Act
        String result = FizzBuzz.fizzBuzz(n);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzShouldReturnFizzForMultipleOfThree() {
        // Arrange
        int n = 9;
        String expected = "Fizz";

        // Act
        String result = FizzBuzz.fizzBuzz(n);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzShouldReturnBuzzForMultipleOfFive() {
        // Arrange
        int n = 20;
        String expected = "Buzz";

        // Act
        String result = FizzBuzz.fizzBuzz(n);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzShouldReturnNumberForNonMultipleOfThreeOrFive() {
        // Arrange
        int n = 11;
        String expected = "11";

        // Act
        String result = FizzBuzz.fizzBuzz(n);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzShouldThrowExceptionForNonPositiveInput() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(0);
        });
    }
}

