package strategy;

import java.util.Random;
/**
 * defines BlockBehavior
 * @author Fred Schein 
 */
public class BlockBehavior implements DefenseBehavior{
    /**
     * creates a random occurence of a block play
     * @return String of what is happening on the block play
     */
    public String play() {
        Random rand = new Random();
        int x = rand.nextInt(4);
        String s = "";

        switch(x) {
            case 0:
                s = "kick";
                break;
            case 1:
                s = "punt";
                break;
            case 2:
                s = "pass";
                break;
            case 3:
                s = "catch";
                break;
        }

        return "block a " + s;
    }
}
