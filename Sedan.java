/**
 * Sedan class that inherits from the Vehicle Class
 * @author ddkeen
 */
public class Sedan extends Vehicle {

    private static final double SEDAN_COST = 20000;

    /**
     * Makes a string representation of a Sedan
     */
    public Sedan() {
        this.description = "Sedan";
    }
    
    /**
     * Returns the cost of the Sedan
     * @return the cost as a double
     */
    public double getCost() {
        return SEDAN_COST;
    }
}
