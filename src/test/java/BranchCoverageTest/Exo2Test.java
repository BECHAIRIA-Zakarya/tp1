package BranchCoverageTest;

import exercice02.AnagramCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    void testIsAnagramShouldReturnTrue() {
        // Arrange
        String s1 = "cinema";
        String s2 = "iceman";

        // Act
        boolean result = AnagramCorrection.isAnagram(s1, s2);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsAnagramShouldReturnFalse() {
        // Arrange
        String s1 = "hello";
        String s2 = "world";

        // Act
        boolean result = AnagramCorrection.isAnagram(s1, s2);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsAnagramForDifferentLengthShouldReturnFalse() {
        // Arrange
        String s1 = "hello";
        String s2 = "work";

        // Act
        boolean result = AnagramCorrection.isAnagram(s1, s2);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsAnagramForNullString1ShouldThrowException() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> {
            AnagramCorrection.isAnagram(null, "test");
        });
    }

    @Test
    void testIsAnagramForNullString2ShouldThrowException() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> {
            AnagramCorrection.isAnagram("test", null);
        });
    }

    @Test
    void testIsAnagramForEmptyStrings() {
        // Arrange
        String s1 = "";
        String s2 = "";

        // Act
        boolean result = AnagramCorrection.isAnagram(s1, s2);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsAnagramForMixedCaseStrings() {
        // Arrange
        String s1 = "Cinema";
        String s2 = "Iceman";

        // Act
        boolean result = AnagramCorrection.isAnagram(s1, s2);

        // Assert
        assertTrue(result);
    }
}
