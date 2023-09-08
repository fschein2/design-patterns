package observer;

public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;
    
    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        this.strokesTotal += strokes;
        this.parTotal += par;
    }

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
