package ConditionCoverageTest;

import exercice04.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    @Test
    void testSolveShouldReturnCorrectRootsForRealRoots() {
        // Arrange
        double a = 1;
        double b = -3;
        double c = 2;

        // Act
        double[] result = QuadraticEquation.solve(a, b, c);

        // Assert
        assertArrayEquals(new double[]{2.0, 1.0}, result);
    }

    @Test
    void testSolveShouldReturnOneRootForZeroDiscriminant() {
        // Arrange
        double a = 1;
        double b = -2;
        double c = 1;

        // Act
        double[] result = QuadraticEquation.solve(a, b, c);

        // Assert
        assertArrayEquals(new double[]{1.0}, result);
    }


    @Test
    void testSolveShouldReturnNullForImaginaryRoots() {
        // Arrange
        double a = 2;
        double b = 4;
        double c = 6;

        // Act
        double[] result = QuadraticEquation.solve(a, b, c);

        // Assert
        assertNull(result);
    }

    @Test
    void testSolveShouldThrowExceptionForZeroCoefficientA() {
        // Arrange
        double a = 0;
        double b = 4;
        double c = 6;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(a, b, c);
        });
    }
}
