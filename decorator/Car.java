package decorator;

/**
 * defines a car which is a Vehicle
 * @author Fred Schein
 */
public class Car extends Vehicle {
   /**
    * instantiates a car which gets the ArrayList it needs by reading in
    * the desired text file using FileReader
    */
   public Car() {
      super(FileReader.getLines("decorator/txt/car.txt"));
   }
}
