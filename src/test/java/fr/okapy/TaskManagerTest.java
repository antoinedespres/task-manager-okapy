package fr.okapy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskManagerTest {
    private static TaskManager taskManager;
    private static char[] commands;

    @BeforeAll
    static void init() {
        taskManager = new TaskManager();
        commands = new char[] {'+', '-', 'x', 'o', 'q'};
    }

    @Test
    // addingTaskABCSchedulesNewTask ??
    void add_ShouldIncreaseListSizeByOne() {
        // Given
        String description = "Learn Python";

        // When
        int actual = 0;
        assertEquals(0, actual);
        taskManager.add(description);

        // Then
        actual = taskManager.nbTasks();
        assertEquals(1, actual);
    }

    @Test
    void itDoesNotWork() {
        int actual = 0;
        assertEquals(1, actual);
    }
}