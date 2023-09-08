package observer;

/**
 * defines RoundScoreDisplay which implements Observer
 * @author Fred Schein
 */
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * creates an instance of RoundScoreDisplay
     * @param golfer
     */
    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * updates the score for the whole round for the golfer
     */
    public void update(int strokes, int par) {
        this.strokesTotal += strokes;
        this.parTotal += par;
    }

    /**
     * creates a string to represent the Golfer's score for the round
     * @return String 
     */
    public String toString() {
        String s = "";
        if ( (strokesTotal - parTotal) > 0 ) {
            s = (strokesTotal - parTotal) + " over";
        }
        else if ( (strokesTotal - parTotal) < 0) {
            s = (parTotal - strokesTotal) + " under";
        }
        else {
            s = "Making";
        }

        return "Overall stats: Par (" + parTotal + ") Strokes (" 
               + strokesTotal + "), " + s + " par";
    }
}
