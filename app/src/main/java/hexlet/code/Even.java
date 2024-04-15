package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void main(String[] args) {
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void playGame() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        final int rounds = 3;
        for (var i = 0; i < rounds; i++) {
            Scanner scannerAnswer = new Scanner(System.in);

            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            Random random = new Random();
            var randomNumber = random.nextInt(100);
            System.out.println("Question :" + randomNumber);
            var evenOrNot = isEven(randomNumber) ? "yes" : "no";
            String answer = scannerAnswer.next();

            if (answer.equals(evenOrNot)) {
                System.out.println("Correct!");
            }

            else {
                System.out.println("' " + answer + "'" + " is wrong answer ;(. Correct answer was '" + evenOrNot +"'\n Lets try again, " + userName); }
            }

            System.out.println("Congratulations, " + userName + "!");

    }
}



