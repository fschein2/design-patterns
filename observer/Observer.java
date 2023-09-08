package observer;

/**
 * defines Observer
 * provides what implementors of Observer must include
 * @author Fred Schein
 */
public interface Observer {
    /**
     * updates score for the golfer
     * @param strokes
     * @param par
     */
    public void update(int strokes, int par);
    /**
     * creates String for the score for the golfer
     * @return String representing golfer's score
     */
    public String toString();
}
