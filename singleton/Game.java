package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * defines Game
 * @author Fred Schein
 */
public class Game {
    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    /**
     * creates an instance of game
     */
    private Game() {
        level = Difficulty.EASY;
        anagrams = new HashMap<Difficulty, ArrayList<Anagram>>();
        anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
        anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
        anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
        rand = new Random();
    }

    /**
     * checks if game is null, if it is it calls Game() to create an instance
     * @return game which is a Game
     */
    public static Game getInstance() {
        if(game == null) {
            game = new Game();
        }

        return game;
    }
    
    /**
     * gets the question of the anagram dependent on the current score of the user
     * @return currentAnagram.getQuestion() which is a String that stores question
     * from the Anagram class
     */
    public String getQuestion() {
        if (score >= 7) {
            level = Difficulty.HARD;
        } else if (score >= 4) {
            level = Difficulty.MEDIUM;
        } else {
            level = Difficulty.EASY;
        }

        int size = anagrams.get(level).size() - 1;
        currentAnagram = anagrams.get(level).get(rand.nextInt(size));

        return currentAnagram.getQuestion();
    }

    /**
     * increments or decrements the score of the user based on if the user gave 
     * a correct response and then returns if the user was correct
     * @param userAnswer String
     * @return currentAnagram.isCorrect(userAnswer) which is a boolean
     */
    public boolean isCorrect(String userAnswer) {
        if (currentAnagram.isCorrect(userAnswer)) {
            score++;
        } else {
            score--;
        }
        return currentAnagram.isCorrect(userAnswer);
    }

    /**
     * gets the current score of the user
     * @return score which is an int
     */
    public int getScore() {
        return score;
    }
}
