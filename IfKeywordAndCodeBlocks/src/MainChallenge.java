public class MainChallenge {


    public static void main(String[] args) {

        boolean gameOver = true;

        int score = 800;

        int levelCompleted = 5;

        int bonus = 100;

        int finalScore = score;

        if(gameOver == true){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        boolean newGameOver = true;
        int newScore = 10_000;
        int newLevelCompleted = 8;
        int newBonus = 200;
       int  newFinalScore = newScore;
        if(newGameOver == true){
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println("Ypur final score was " + newFinalScore);
        }
    }
}
