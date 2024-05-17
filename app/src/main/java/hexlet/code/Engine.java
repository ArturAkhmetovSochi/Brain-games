package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;

    public static void playGame(String question, String[][] questionAndAnswer) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(question);

        for (var i = 0; i < ROUNDS; i++) {
            Scanner scannerAnswer = new Scanner(System.in);

            System.out.println("Question: " + questionAndAnswer[i][0]);
            String answer = scannerAnswer.next();
            if (answer.toLowerCase().equals(questionAndAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("' " + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + questionAndAnswer[i][1] + "'\n Lets try again, " + userName);
            }

        }

        System.out.println("Congratulations, " + userName + "!");
    }
}