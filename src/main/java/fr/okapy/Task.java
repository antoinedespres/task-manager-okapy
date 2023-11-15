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

    @Override
    public String toString() {
        // TODO
        // System.out.println(" [ " + isDone ?? "*" : " " + "] " + description);
        return "";
    }
}
