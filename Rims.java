/**
 * Rims class that inherits from the VehicleDecorator Class
 * Adds rims to the string representation of a vehicle and adds to the cost
 * @author ddkeen
 */
public class Rims extends VehicleDecorator{

    private Vehicle vehicle;

    private static final double RIM_COST = 200;

    /**
     * Takes in a Vehicle object and makes it the Rims' object's private instance variable so it's description and cost can be altered
     * @param vehicle the vehicle to be altered
     */
    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

     /**
     * Gives a String representation of the Vehicle with new rims
     * @return a String representation of the changed Vehicle
     */
    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

    /**
     * Gives the cost of the Vehicle with the added cost of new rims
     * @return a double representation of the cost of the changed Vehicle
     */
    public double getCost() {
        return vehicle.getCost() + RIM_COST;
    }
    
}
