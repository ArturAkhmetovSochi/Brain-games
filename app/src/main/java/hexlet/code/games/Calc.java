package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.playGame;

public class Calc {

    private static final String[] OPERATIONS = {" + ", " * ", " - "};
    private static final String QUESTION = ("What is the result of the expression?");
    private static final int RANDOM_NUMBER_RANGE_MAX = 10;

    public static int calculateAnswer(int firstNumber, int secondNumber, String operation) {
        var result = 0;

        switch (operation) {
            case " + ":
                result = firstNumber + secondNumber;
                break;
            case " - ":
                result = firstNumber - secondNumber;
                break;
            case " * ":
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Please use correct operator");
                break;
        }

        return result;
    }

    public static void runGame() {
        Random random = new Random();
        String question = QUESTION;
        String[][] questionAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            var randomNumber1 = random.nextInt(RANDOM_NUMBER_RANGE_MAX);
            var randomNumber2 = random.nextInt(RANDOM_NUMBER_RANGE_MAX);
            var randomOperation = OPERATIONS[random.nextInt(OPERATIONS.length)];

            questionAndAnswers[i][0] = Integer.toString(randomNumber1) + randomOperation
                    + Integer.toString(randomNumber2);
            questionAndAnswers[i][1] = Integer.toString(calculateAnswer(randomNumber1, randomNumber2, randomOperation));
        }
        playGame(question, questionAndAnswers);
    }
}


