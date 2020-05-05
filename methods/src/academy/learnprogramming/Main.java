package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true,800,5,100);
        System.out.println("Your final score was " + highScore);
        calculateScore(true,10000, 8, 200);

        boolean gameOver = true;
        int score = 1200;
        int levelCompleted = 9;
        int bonus = 150;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("James", calculateHighScorePosition(1500));
        displayHighScorePosition("Peter", calculateHighScorePosition(900));
        displayHighScorePosition("Remulus", calculateHighScorePosition(400));
        displayHighScorePosition("Lupin", calculateHighScorePosition(50));
    }

        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                return finalScore;
            }
            return -1; //because it stops running after the first return it only does this if gameOver is false
        }

        public static void displayHighScorePosition(String playerName, int position) {
            System.out.println(playerName+" managed to get to position " + position+ " on the highscore table!");
        }

        public static int calculateHighScorePosition(int score){
            int position;
            if (score >= 1000) {
                position = 1;
            } else if (score >= 500) {
                position = 2;
            } else if (score >= 100) {
                position = 3;
            } else {
                position = 4;
            }
            return position;
        }
    }