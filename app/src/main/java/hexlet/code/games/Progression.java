package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.playGame;

public class Progression {

    private static final String QUESTION = "What number is missing in the progression?";
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int MIN_RANDOM_STEP = 2;
    private static final int MAX_RANDOM_STEP = 10;
    private static final int MIN_RANDOM_LENGTH = 6;
    private static final int MAX_RANDOM_LENGTH = 10;

    private static String[] progression(int number, int step, int length) {
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = Integer.toString(number + (step * i));
        }
        return result;
    }

    public static void runGame() {
        String question = QUESTION;
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            Random random = new Random();
            var randomNumber = random.nextInt(MAX_RANDOM_NUMBER);
            var randomStep = random.nextInt(MIN_RANDOM_STEP, MAX_RANDOM_STEP);
            var randomLength = random.nextInt(MIN_RANDOM_LENGTH, MAX_RANDOM_LENGTH);

            String[] newProgression = progression(randomNumber, randomStep, randomLength);
            var missingNumber = random.nextInt(MIN_RANDOM_LENGTH, randomLength);
            String result = newProgression[missingNumber - 1];
            newProgression[missingNumber - 1] = "..";

            questionsAndAnswers[i][0] = String.join(" ", newProgression);
            questionsAndAnswers[i][1] = result;
        }
        playGame(question, questionsAndAnswers);

    }
}