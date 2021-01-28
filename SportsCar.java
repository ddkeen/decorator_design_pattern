/**
 * SportsCar class that inherits from the Vehicle Class
 * @author ddkeen
 */
public class SportsCar extends Vehicle{

    private static final double SPORTSCAR_COST = 30000;

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
        return SPORTSCAR_COST;
    }
    
}