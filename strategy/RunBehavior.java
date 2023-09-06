package strategy;

import java.util.Random;

/**
 * defines RunBehavior
 * @author Fred Schein
 */
public class RunBehavior implements OffenseBehavior{
    /**
     * creates a random occurence of a run play
     * @return String of what is happening on the run play
     */
    public String play() {
        Random rand = new Random();
        int x = rand.nextInt(4);
        String s = "";

        switch(x) {
            case 0:
                s = "drive (up the gut)";
                break;
            case 1:
                s = "draw";
                break;
            case 2:
                s = "pitch";
                break;
            case 3:
                s = "reverse";
                break;
        }

        return "runs a " + s;
    }
}
