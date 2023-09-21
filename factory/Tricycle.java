package factory;

/**
 * defines Tricycle
 * @author Fred Schein
 */
public class Tricycle extends Bike {
    /**
     * creates an instance of a Tricycle
     */
    public Tricycle() {
        name = "Tricycle";
        price = 0.0;
        numWheels = 3;
        hasPedals = true;
        hasTrainingWheels = false;
    }
}
