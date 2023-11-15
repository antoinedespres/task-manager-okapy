package fr.okapy;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public int nbTasks() {
        return tasks.size();
    }

    public void add(String description) {
        tasks.add(new Task("Learn Python"));
    }
}
