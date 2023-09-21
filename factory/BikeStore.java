package factory;

/**
 * defines BikeStore
 * @author Fred Schein
 */
public class BikeStore extends Bike {
    /**
     * takes the user input for what bike they would like and 
     * creates the respective Bike and the calls assembleBike() 
     * which builds the bike for the user
     * @param type
     * @return bike which is a Bike
     */
    public Bike createBike(String type) {
        Bike bike = null;

        if(type.equals("tricycle")) {
            bike = new Tricycle();
        } else if(type.equals("strider")) {
            bike = new Strider();
        } else if(type.equals("kids bike")) {
            bike = new KidsBike();
        }

        bike.assembleBike();

        return bike;
    }
}
