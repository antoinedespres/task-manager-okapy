package fr.okapy;

public class Main {
    public static boolean isAlive = true;
    public static TaskManager manager = new TaskManager();

    public static void main(String[] args) {

    }

    public static void run(String input) {
        // TODO Split the input
        String[] tokens = input.split(" ", 2);
        char command = tokens[0].charAt(0);
        String subject = tokens[1];

        switch(command) {
            case '+':
                manager.add(subject);
                break;
            case 'q':
                isAlive = false;
                break;
        }
    }
}