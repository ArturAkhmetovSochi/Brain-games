package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.playGame;

public class Progression {
    public static void main(String[] args) {
    }

    private static String[] progression(int number, int step, int length) {
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = Integer.toString(number + (step * i));
        }
        return result;
    }

    public static void runGame() {
        String question = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            Random random = new Random();
            var randomNumber = random.nextInt(10);
            var randomStep = random.nextInt(2, 10);
            var randomLength = random.nextInt(5, 10);

            String[] newProgression = progression(randomNumber, randomStep, randomLength);
            var missingNumber = random.nextInt(5, randomLength);
            String result = newProgression[missingNumber - 1];
            newProgression[missingNumber - 1] = "..";

            questionsAndAnswers[i][0] = String.join(" ", newProgression);
            questionsAndAnswers[i][1] = result;
        }
        playGame(question, questionsAndAnswers);

    }
}