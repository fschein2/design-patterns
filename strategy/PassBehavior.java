package strategy;

import java.util.Random;

/**
 * defines PassBehavior
 * @author Fred Schein
 */
public class PassBehavior implements OffenseBehavior{
    /**
     * creates a random occurence of a pass play
     * @return String of what is happening on the pass play
     */
    public String play() {
        Random rand = new Random();
        int x = rand.nextInt(5);
        String s = "";

        switch(x) {
            case 0:
                s = "slant route";
                break;
            case 1:
                s = "out route";
                break;
            case 2:
                s = "seem route";
                break;
            case 3:
                s = "screen pass";
                break;
            case 4:
                s = "hail mary";
                break;
        }

        return "throws a " + s;
    }
}
