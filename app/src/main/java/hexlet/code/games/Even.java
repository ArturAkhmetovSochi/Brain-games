package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.playGame;


public class Even {
    public static void main(String[] args) {
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void runGame() {

        String question = ("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[][] questionAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            Random random = new Random();
            var randomNumber = random.nextInt(100);

            questionAndAnswers[i][0] = Integer.toString(randomNumber);
            questionAndAnswers[i][1] = (isEven(randomNumber)) ? "yes" : "no";
        }
        playGame(question, questionAndAnswers);
    }
}



