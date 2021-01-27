/**
 * Compact class that inherits from the Vehicle Class
 * @author ddkeen
 */
public class Compact extends Vehicle {

    /**
     * Makes a string representation of a Compact car
     */
    public Compact() {
        this.description = "Compact";
    }

    /**
     * Returns the cost of the Compact car
     * @return the cost as a double
     */
    public double getCost() {
        return 15000;
    }
}
