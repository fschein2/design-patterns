package decorator;

/**
 * defines Rims which is a VehicleDecorator
 * @author Fred Schein
 */
public class Rims extends VehicleDecorator {
    /**
     * instantiates Rims which calls integrateDecor to edit the ArrayList
     * @param vehicle
     */
    public Rims(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/rims.txt"));
    }
}
