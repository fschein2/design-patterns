package strategy;

/**
 * defines OBlockBehavior
 * @author Fred Schein
 */
public class OBlockBehavior implements OffenseBehavior{
    /**
     * creates a OBlock play
     * @return String of what happens on the OBlock play
     */
    public String play() {
        return "Block defenders";
    }
}
