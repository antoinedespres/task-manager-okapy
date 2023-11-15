package fr.okapy;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public int nbTasks() {
        return tasks.size();
    }

    public void add(String description) {
        tasks.add(new Task(description));
    }
    
    public Task remove(int id) {
        return tasks.remove(id);
    }
}
