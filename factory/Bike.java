package factory;

/**
 * defines Bike
 * @author Fred Schein
 */
public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * builds a Bike by creating a String by calling the 
     * respective methods that are apart of the Bike building 
     * process
     * @return s which is a String
     */
    public String assembleBike() {
        String s = "Creating a " + name;
        s += createFrame();
        s += addWheels();
        s += addPedals();

        return s;
    }

    /**
     * creates a String for the frame of the Bike
     * @return a String the tells us what frame we created for the Bike
     */
    private String createFrame() {
        return "\n- Assembling " + name + " frame";
    }

    /**
     * creates a String for the wheels on the Bike
     * @return s which is a String that tells us how many pedals
     * the Bike has and if it has training wheels
     */
    private String addWheels() {
        String s = "";

        if(hasTrainingWheels){
            s = "\n- Adding " + numWheels + " wheel(s)" +
                "\n- Adding training wheels";
        } else {
            s = "\n- Adding " + numWheels + " wheel(s)";
        }

        return s;
    }

    /**
     * creates a String for the pedals on the Bike
     * @return s which is a String that tells us if the Bike has pedals
     */
    private String addPedals() {
        String s = "";

        if(hasPedals) {
            s = "\n- Adding pedals";
        }
        
        return s;
    }

    /**
     * retrives the price of the Bike
     * @return price which is a double
     */
    public double getPrice() {
        return price;
    }
}
