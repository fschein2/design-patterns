package decorator;

/**
 * defines Paint which is a VehicleDecorator
 * @author Fred Schein
 */
public class Paint extends VehicleDecorator {
    /**
     * instantiates Paint which should edit the color of the terminal
     * (index of color throws off merging arrays)
     * @param vehicle
     * @param color
     */
    public Paint(Vehicle vehicle, String color) {
        super(vehicle.lines);

       /*if( color.equalsIgnoreCase("red")) {
            vehicle.lines.add(0, "\u001B[31m");
            vehicle.lines.add("\u001B[0m");
            integrateDecor(vehicle.lines);
        }*/
    }
}
