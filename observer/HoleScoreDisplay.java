package observer;

public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        this.strokes = 0;
        this.strokes += strokes;
        this.par = 0;
        this.par += par;

    }

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
