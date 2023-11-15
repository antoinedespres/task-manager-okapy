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
        if(tokens[0].charAt(0) == 'q') {
            isAlive = false;
            return;
        }
        String subject = tokens[1];

        switch(command) {
            case '+':
                manager.add(subject);
                break;
            case '-':
                manager.remove(Integer.parseInt(subject) - 1 );
                break;
        }
    }
}