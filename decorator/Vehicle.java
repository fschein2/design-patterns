package decorator;

import java.util.ArrayList;

/**
 * defines a Vehicle
 * @author Fred Schein
 */
public abstract class Vehicle {

    protected ArrayList<String> lines;

    /**
     * instantiates Vehicle to have an ArrayList which contains the 
     * image of a car
     * @param lines
     */
    public Vehicle(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * prints out the image 
     */
    public String toString() {
        for ( int x = 0; x < lines.size(); x++ ) {
            System.out.println(lines.get(x));
        }

        return "";
    }
}
