package decorator;

import java.util.ArrayList;

/**
 * defines VehicleDecorator which is a and has a Vehicle
 * @author Fred Schein
 */
public abstract class VehicleDecorator extends Vehicle {

    /**
     * instantiates VehicleDecorator
     * @param lines
     */
    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    /**
     * changes both the decor ArrayList and the lines ArrayList into each
     * String being its own char Array. after being turned into a char Array
     * the two arrays are merged into one another and then build a new String
     * Array which is then what lines is set equal to
     * @param decor
     */
    protected void integrateDecor(ArrayList<String> decor) {
        for ( int i = 0; i < decor.size(); i++ ) {
            String dString = decor.get(i);
            char [] dArray = new char[dString.length()];
            for ( int x = 0; x < dString.length(); x++ ) {
                dArray[x] = dString.charAt(x);
            }
            String lString = lines.get(i);
            char [] lArray = new char[lString.length()];
            for ( int y = 0; y < lString.length(); y++ ) {
                lArray[y] = lString.charAt(y);
            }
            for ( int z = 0; z < dArray.length; z++ ) {
                if ( dArray[z] != ' ' ) {
                    lArray[z] = dArray[z];
                }
            }
            String newString = new String(lArray);
            lines.set(i, newString);
        }
    }

}
