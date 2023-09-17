package decorator;

/**
 * defines Smile which is a VehicleDecorator
 * @author Fred Schein
 */
public class Smile extends VehicleDecorator {
    /**
     * instantiates a Smile which calls integrateDecor to edit the ArrayList
     * @param vehicle
     */
    public Smile(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/smile.txt"));
    }
}
