package strategy;

/**
 * contains the definition of a Receiver
 * @author Fred Schein
 */
public class Receiver extends Player{
    /**
     * creates an instance of a Reciever
     * @param firstName
     * @param lastName
     * @param offense
     */
    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * sets the defense behavior
     */
    @Override
    public void setDefenseBehavior() {
        defenseBehavior = null;
    }

    /**
     * sets the offense behavior
     */
    @Override
    public void setOffenseBehavior() {
        offenseBehavior = new ReceiveBehavior();
    }
    
}
