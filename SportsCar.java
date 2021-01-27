/**
 * SportsCar class that inherits from the Vehicle Class
 * @author ddkeen
 */
public class SportsCar extends Vehicle{

    /**
     * Makes a string representation of a SportsCar
     */
    public SportsCar() {
        this.description = "Sports Car";
    }

    /**
     * Returns the cost of the Sports Car
     * @return the cost as a double
     */
    public double getCost() {
        return 30000;
    }
    
}