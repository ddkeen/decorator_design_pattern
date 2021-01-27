/**
 * Abstract class that is the parent class of all Vehicle objects
 * including Sedans, SportsCar, and Compacts
 * @author ddkeen
 */
public abstract class Vehicle {

    protected String description;

    /**
     * Returns the String description of the Vehicle including it's type and any other attributes
     * @return a String description of the Vehicle
     */
    public String toString() {
        return description;
    }

    /**
     * Abstract method to return the cost of the Vehicle
     * @return the cost of the Vehicle as a double
     */
    public abstract double getCost();
    
}