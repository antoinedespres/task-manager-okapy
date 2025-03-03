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
        if (id >= tasks.size())
            return null;
        return tasks.remove(id);
    }

    public void setToDone(int id) {
        Task task = this.tasks.get(id);
        task.setStatus(true);
    }

    public void setToUndone(int id) {
        Task task = this.tasks.get(id);
        task.setStatus(false);
    }
}
