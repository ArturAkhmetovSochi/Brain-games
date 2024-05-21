package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.playGame;

public class Prime {

    private static final String QUESTION = "Answer 'yes' if given number is prime, otherwise answer 'no'.";
    private static final int RANDOM_NUMBER_RANGE_MAX = 100;

    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void runGame() {
        String question = (QUESTION);
        String[][] questionAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            Random random = new Random();
            var randomNumber = random.nextInt(RANDOM_NUMBER_RANGE_MAX);

            questionAndAnswers[i][0] = Integer.toString(randomNumber);
            questionAndAnswers[i][1] = (isSimple(randomNumber)) ? "yes" : "no";
        }
        playGame(question, questionAndAnswers);
    }
}
