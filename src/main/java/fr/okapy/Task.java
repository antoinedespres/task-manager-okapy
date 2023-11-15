package fr.okapy;

public class Task {
    private final String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void toggleStatus() {
        this.isDone = !this.isDone;
    }

    @Override
    public String toString() {
        // TODO
        // return " [ " + isDone ?? "*" : " " + "] " + description;
        return "";
    }
}
