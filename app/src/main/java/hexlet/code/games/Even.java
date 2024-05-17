package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.playGame;


public class Even {

    private static final String QUESTION = ("Answer 'yes' if the number is even, otherwise answer 'no'.");
    private static final int RANDOM_NUMBER_RANGE_MAX = 100;

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void runGame() {

        String question = QUESTION;
        String[][] questionAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            Random random = new Random();
            var randomNumber = random.nextInt(RANDOM_NUMBER_RANGE_MAX);

            questionAndAnswers[i][0] = Integer.toString(randomNumber);
            questionAndAnswers[i][1] = (isEven(randomNumber)) ? "yes" : "no";
        }
        playGame(question, questionAndAnswers);
    }
}



