package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
    }
    public static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }

}


