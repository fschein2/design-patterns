package observer;

/**
 * defines Subject
 * provides what implementors of Subject must include
 * @author Fred Schein
 */
public interface Subject {
   /**
    * adds an Observer to the observer list
    * @param observer
    */
   public void registerObserver(Observer observer);
   /**
    * deletes an observer from the observer list 
    * @param observer
    */
   public void removeObserver(Observer observer);
   /**
    * tells an observer a change must be made
    * in this case to the golfer's score
    * @param strokes
    * @param par
    */
   public void notifyObserver(int strokes, int par);
}
