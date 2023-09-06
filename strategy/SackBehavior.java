package strategy;

/**
 * defines SackBehavior
 * @author Fred Schein
 */
public class SackBehavior implements DefenseBehavior{
    /**
     * creates a sack play
     * @return String of what happens on the sack play
     */
    public String play() {
        return "Sack the quarterback";
    }
}
