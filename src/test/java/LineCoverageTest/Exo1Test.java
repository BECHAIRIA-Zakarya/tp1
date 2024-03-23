package LineCoverageTest;

import exercice01.PalindromeCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    void testIsPalindromeShouldReturnTrue() {
        // Arrange
        String palindrome = "Was it a car or a cat I saw";

        // Act
        boolean result = PalindromeCorrection.isPalindrome(palindrome);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPalindromeShouldReturnFalse() {
        // Arrange
        String nonPalindrome = "travail";

        // Act
        boolean result = PalindromeCorrection.isPalindrome(nonPalindrome);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsPalindromeForNullStringShouldThrowException() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> {
            PalindromeCorrection.isPalindrome(null);
        });
    }
}
