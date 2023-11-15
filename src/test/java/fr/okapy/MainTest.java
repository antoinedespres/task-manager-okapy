package fr.okapy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void run_ShouldAddTask_WhenPlusActionIsEntered() {
        // Given
        String input = "+ Learn new things";

        // When
        Main.run(input);

        // Then
        assertEquals(1, Main.manager.nbTasks());
    }
}
