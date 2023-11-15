package fr.okapy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TaskTest {

    @Test
    public void newTask_ShouldBeSetIsDonePropertyToFalseByDefault() {
        // Given
        String description = "Learn";

        // When
        Task task = new Task(description);

        // Then
        assertFalse(task.isDone());
    }
}
