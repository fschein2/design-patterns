package factory;

/**
 * defines KidsBike
 * @author Fred Schein
 */
public class KidsBike extends Bike {
    /**
     * Creates an instance of a KidsBike
     */
    public KidsBike() {
        name = "Kids Bike";
        price = 0.0;
        numWheels = 2;
        hasPedals = true;
        hasTrainingWheels = true;
    }
}
