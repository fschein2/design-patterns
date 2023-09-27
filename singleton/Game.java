package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game {
    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    private Game() {
        // needs work
        rand = new Random();
    }

    public static Game getInstance() { 
        if (game == null) {
            game = new Game();
        }
    
        return game;
    }

    public String getQuestion() {
        // needs work
    }

    public boolean isCorrect(String userAnswer) {
        // may need work
        return currentAnagram.isCorrect(userAnswer);
    }

    public int getScore() {
        return score;
    }
}
