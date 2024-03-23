package LineCoverageTest;

import exercice03.BinarySearchCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {

    @Test
    void testBinarySearchShouldReturnCorrectIndex() {
        // Arrange
        int[] array = {1, 3, 5, 7, 9, 11};
        int element = 3;

        // Act
        int result = BinarySearchCorrection.binarySearch(array, element);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void testBinarySearchShouldReturnNegativeOneForNonExistentElement() {
        // Arrange
        int[] array = {1, 3, 5, 7, 9, 11};
        int element = 10;

        // Act
        int result = BinarySearchCorrection.binarySearch(array, element);

        // Assert
        assertEquals(-1, result);
    }

    @Test
    void testBinarySearchShouldReturnNegativeOneForNullArray() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> {
            BinarySearchCorrection.binarySearch(null, 5);
        });
    }


}
