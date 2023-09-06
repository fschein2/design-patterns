package strategy;
/**
 * defines StripBehavior
 * @author Fred Schein
 */
public class StripBehavior implements DefenseBehavior{
    /**
     * creates a strip play
     * @return String of what happens on the strip play
     */
    public String play() {
        return "Strip a ball from runners hands";
    }
}
