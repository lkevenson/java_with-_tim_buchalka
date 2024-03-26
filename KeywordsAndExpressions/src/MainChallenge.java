public class MainChallenge {

    public static void main(String[] args) {
//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("The highScore is " + highScore);
//
//        highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("The highScore is " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

         highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Bob", highScorePosition);

         highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Percy", highScorePosition);

         highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Gilbert", highScorePosition);

         highScorePosition = calculateHighScorePosition(-1000);
        displayHighScorePosition("James", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return  1;
        } else if (playerScore >= 500) {
            return  2;
        } else if (playerScore >= 100 ) {
            return  3;
        } else {
            return  4;
        }
    }
}
