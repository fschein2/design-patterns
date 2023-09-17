package decorator;

/**
 * defines Paint which is a VehicleDecorator
 * @author Fred Schein
 */
public class Paint extends VehicleDecorator {
    /**
     * instantiates Paint which should edit the color of the terminal
     * (failed to do so (example code for "Red" does not work as intended))
     * @param vehicle
     * @param color
     */
    public Paint(Vehicle vehicle, String color) {
        super(vehicle.lines);

        if( color == "Red" ) {
            vehicle.lines.add(0, "\u001B[31m");
            vehicle.lines.add("\u001B[0m");
            integrateDecor(vehicle.lines);
        }
    }
}
