package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.playGame;

public class GCD {
    public static void main(String[] args) {
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void runGame() {
        String question = ("Find the greatest common divisor of given numbers.");
        String[][] questionAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            Random random = new Random();
            var randomNumber1 = random.nextInt(100);
            var randomNumber2 = random.nextInt(100);

            questionAndAnswers[i][0] = Integer.toString(randomNumber1) + " " + Integer.toString(randomNumber2);
            questionAndAnswers[i][1] = Integer.toString(gcd(randomNumber1, randomNumber2));
        }
        playGame(question, questionAndAnswers);
    }
}
