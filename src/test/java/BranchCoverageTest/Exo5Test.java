package BranchCoverageTest;

import exercice05.RomanNumeralCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    void testToRomanShouldReturnCorrectRomanNumeralForValidInput() {
        // Arrange
        int n = 2024;
        String expected = "MMXXIV";

        // Act
        String result = RomanNumeralCorrection.toRoman(n);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testToRomanShouldThrowExceptionForOutOfRangeInput() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralCorrection.toRoman(4000);
        });
    }

    @Test
    void testToRomanShouldThrowExceptionForNegativeInput() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralCorrection.toRoman(-5);
        });
    }
}

