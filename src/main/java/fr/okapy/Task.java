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

    public void setStatus(boolean status) {
        this.isDone = status;
    }

    @Override
    public String toString() {
        String status = this.isDone ? "x" : " ";
        return "[" + status + "] " + description;
    }
}
