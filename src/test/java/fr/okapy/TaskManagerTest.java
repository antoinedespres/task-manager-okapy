package fr.okapy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskManagerTest {
    private static TaskManager taskManager;

    @BeforeEach
    void init() {
        taskManager = new TaskManager();
    }

    @Test
    void add_ShouldIncreaseListSizeByOne() {
        // Given
        String description = "Learn Python";

        // When
        taskManager.add(description);

        // Then
        int actual = taskManager.nbTasks();
        assertEquals(1, actual);
    }

    @Test
    void add_ShouldPushTheCorrectTaskDescription() {
        // Given
        String description = "Learn Java";

        // When
        taskManager.add(description);

        // Then
        List<Task> tasks = taskManager.getTasks();
        assertEquals(description, tasks.get(0).getDescription());
    }

    @Test
    void remove_shouldRemoveTheCorrectTask_whenRelatedIDIsGiven(){
        // Given
        List<Task> tasks = new ArrayList(){{
            add(new Task("Learn C++"));
            add(new Task("Learn JavaScript"));
        }};
        taskManager.setTasks(tasks);

        // When
        Task removedTask = taskManager.remove(1);

        // Assert
        assertEquals("Learn JavaScript",removedTask.getDescription());
    }
}