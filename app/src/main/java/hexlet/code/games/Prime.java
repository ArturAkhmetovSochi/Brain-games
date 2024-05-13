package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.playGame;

public class Prime {
    public static void main(String[] args) {
    }

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
        String question = ("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        String[][] questionAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            Random random = new Random();
            var randomNumber = random.nextInt(100);

            questionAndAnswers[i][0] = Integer.toString(randomNumber);
            questionAndAnswers[i][1] = (isSimple(randomNumber)) ? "yes" : "no";
        }
        playGame(question, questionAndAnswers);
    }
}
