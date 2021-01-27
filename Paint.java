/**
 * Paint class that inherits from the VehicleDecorator Class
 * Adds paint to the string representation of a vehicle and adds to the cost
 * @author ddkeen
 */
public class Paint extends VehicleDecorator {

    private Vehicle vehicle;

    /**
     * Takes in a Vehicle object and makes it the paint object's private instance variable so it's description and cost can be altered
     * @param vehicle the vehicle to be altered
     */
    public Paint(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Gives a String representation of the Vehicle with added paint
     * @return a String representation of the changed Vehicle
     */
    public String toString() {
        return vehicle.toString() + ", fancy paint";
    }

    /**
     * Gives the cost of the Vehicle with the added cost of paint
     * @return a double representation of the cost of the changed Vehicle
     */
    public double getCost() {
        return vehicle.getCost() + 150;
    }
    
}
