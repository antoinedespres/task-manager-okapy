package fr.okapy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MainTest {

    @Test
    public void run_ShouldQuitTheWhileLoop_WhenQIsGiven() {
        // Given
        String input = "q";

        // When
        Main.run(input);

        // Then
        assertFalse(Main.isAlive);
    }
}
