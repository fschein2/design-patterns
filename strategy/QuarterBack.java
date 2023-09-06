package strategy;

import java.util.Random;

/**
 * contains the definition of a QuarterBack
 * @author Fred Schein
 */
public class QuarterBack extends Player{
    /**
     * creates an instance of a QuarterBack
     * @param firstName
     * @param lastName
     * @param offense
     */
    public QuarterBack(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * sets the defenseBehavior
     */
    @Override
    public void setDefenseBehavior() {
        defenseBehavior = null;
    }

    /**
     * Sets the offenseBehavior
     */
    @Override
    public void setOffenseBehavior() {
        Random rand = new Random();
        int x = rand.nextInt(2);
    
        switch(x) {
            case 0:
                offenseBehavior = new RunBehavior();
                break;
            case 1:
                offenseBehavior = new PassBehavior();
                break;
        }
    }
    
}
