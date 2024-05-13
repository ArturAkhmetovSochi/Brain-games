package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.playGame;

public class Calc {
    public static void main(String[] args) {
    }
    private static final String[] OPERATIONS = {" + ", " * ", " - "};

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
        String question = ("What is the result of the expression?");
        String[][] questionAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            Random random = new Random();
            var randomNumber1 = random.nextInt(10);
            var randomNumber2 = random.nextInt(10);
            var randomOperation = OPERATIONS[random.nextInt(OPERATIONS.length)];

            questionAndAnswers[i][0] = Integer.toString(randomNumber1) + randomOperation
                    + Integer.toString(randomNumber2);
            questionAndAnswers[i][1] = Integer.toString(calculateAnswer(randomNumber1, randomNumber2, randomOperation));
        }
        playGame(question, questionAndAnswers);
    }
}


