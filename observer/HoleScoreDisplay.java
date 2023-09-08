package observer;

/**
 * defines HoleScoreDisplay which implements Observer
 * @author Fred Schein
 */
public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * creates an instance of HoleScoreDisplay
     * @param golfer
     */
    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * updates the score for one specific hole for the Golfer
     */
    public void update(int strokes, int par) {
        this.strokes = 0;
        this.strokes += strokes;
        this.par = 0;
        this.par += par;

    }

    /**
     * creates a string to represent the Golfer's score for one hole
     * @return String 
     */
    public String toString() {
        String s = "";
        if ( (strokes - par) > 0 ) {
            s = (strokes - par) + " over";
        }
        else if ( (strokes - par) < 0) {
            s = (par - strokes) + " under";
        }
        else {
            s = "Making";
        }

        return "Current Hole stats: Par (" + par + ") Strokes (" 
               + strokes + "), " + s + " par";
    }
}
