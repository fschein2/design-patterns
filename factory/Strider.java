package factory;

/**
 * defines Strider
 * @author Fred Schein
 */
public class Strider extends Bike {
    /**
     * creates an instance of a Strider
     */
    public Strider() {
        name = "Strider";
        price = 0.0;
        numWheels = 2;
        hasPedals = false;
        hasTrainingWheels = false;
    }
}
