package singleton;

import java.util.ArrayList;

/**
 * defines Anagram
 * @author Fred Schein
 */
public class Anagram {
    private String question;
    private ArrayList<String> answers;
    
    /**
     * creates an instance of an Anagram
     * @param question String
     * @param answers ArrayList<String>
     */
    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    /**
     * gets the question of the Anagram
     * @return question which is a String
     */
    public String getQuestion() {
        return question;
    }

    /**
     * checks if the user gave a correct response
     * @param userAnswer String
     * @return true or false (boolean) depending on if the user was correct or not
     */
    public boolean isCorrect(String userAnswer) {
        for (int i = 0; i < answers.size(); i++) {
            if (userAnswer.equalsIgnoreCase(answers.get(i))) {
                return true;
            }
        }

        return false;
    }
}
