package fr.okapy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void run_ShouldRemoveTask_WhenMinusActionIsEntered() {
        // Given
        List<Task> tasks = new ArrayList(){{
            add(new Task("Learn C++"));
        }};
        Main.manager.setTasks(tasks);

        String input = "- 1";

        // When
        Main.run(input);

        // Then
        assertEquals(0, Main.manager.nbTasks());
    }
}
