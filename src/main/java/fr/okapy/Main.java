package fr.okapy;

public class Main {
    public static boolean isAlive = true;
    public static void main(String[] args) {

    }

    public static void run(String input) {
        // TODO Split the input
        String[] tokens = input.split(" ", 2);
        char command = tokens[0].charAt(0);
        isAlive = command != 'q';

        while(isAlive) {

        }
    }
}