package strategy;

/**
 * contains the definition of a Player
 * @author Fred Schein
 */
public abstract class Player {
    String firstName;
    String lastName;
    boolean offense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    /**
     * creates an instance of a Player
     * @param firstName
     * @param lastName
     * @param offense
     */
    public Player(String firstName, String lastName, boolean offense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
        setOffenseBehavior();
        setDefenseBehavior();
    }

    /**
     * Sets Player's defenseBehavior
     */
    abstract public void setDefenseBehavior();

    /**
     * sets Player's offenseBehavior
     */
    abstract public void setOffenseBehavior();

    /**
     * calls the respective play method
     * @return string from the respective play() method
     */
    public String play() {
        if(offense && offenseBehavior != null) {
            setOffenseBehavior();
            return offenseBehavior.play();
        }
        else if(!offense && defenseBehavior != null) {
            setDefenseBehavior();
            return defenseBehavior.play();
        }
        else {
            return "not playing";
        }
    }

    /**
     * changes if player is cuurently on offense or not
     */
    public void turnover() {
        offense = !offense;
    }

    /**
     * provides the Player's name
     * @return String of Player's name
     */
    public String toString() {
        return firstName + " " + lastName;
    }
}
