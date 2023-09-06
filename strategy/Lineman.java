package strategy;

import java.util.Random;
/**
 * contains the definition of a Lineman
 * @author Fred Schein
 */
public class Lineman extends Player{
    /**
     * creates an instance of a Lineman
     * @param firstName
     * @param lastName
     * @param offense
     */
    public Lineman(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * sets defenseBehavior
     */
    @Override
    public void setDefenseBehavior() {
        Random rand = new Random();
        int x = rand.nextInt(3);
    
        switch(x) {
            case 0:
                defenseBehavior = new BlockBehavior();
                break;
            case 1:
                defenseBehavior = new StripBehavior();
                break;
            case 2:
                defenseBehavior = new SackBehavior();
                break;
        }
    }

    /**
     * sets offenseBehavior
     */
    @Override
    public void setOffenseBehavior() {
        offenseBehavior = new OBlockBehavior();
    }
    
}
