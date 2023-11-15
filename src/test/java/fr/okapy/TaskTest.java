package fr.okapy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void setStatus_ShouldChangeTaskStatusToDone() {
        // Given
        String description = "Learn TypeScript";
        Task task = new Task(description);

        // When
        task.setStatus(true);

        // Then
        assertTrue(task.isDone());
    }

    @Test
    public void setStatus_ShouldChangeTaskStatusToToDo() {
        // Given
        String description = "Learn TypeScript";
        Task task = new Task(description);

        // When
        task.setStatus(false);

        // Then
        assertFalse(task.isDone());
    }

    @Test
    public void toString_ShouldReturnTodoStringFormat_WhenTaskIsNotDone() {
        // Given
        Task task = new Task("Test");

        // When
        String output = task.toString();

        // Then
        assertEquals("[ ] Test", output);
    }

    @Test
    public void toString_ShouldReturnDoneStringFormat_WhenTaskIsDone() {
        // Given
        Task task = new Task("Test");
        task.setStatus(true);

        // When
        String output = task.toString();

        // Then
        assertEquals("[x] Test", output);
    }
}
