import org.example.exercice01.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    void testIsPalindromeForPalindromeString() {
        // Arrange
        String palindrome = "A man a plan a canal Panama";

        // Act
        boolean result = Palindrome.isPalindrome(palindrome);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPalindromeForNonPalindromeString() {
        // Arrange
        String nonPalindrome = "hello";

        // Act
        boolean result = Palindrome.isPalindrome(nonPalindrome);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsPalindromeForNullStringShouldThrowException() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
    }
}
