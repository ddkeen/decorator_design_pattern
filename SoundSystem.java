/**
 * SoundSystem class that inherits from the VehicleDecorator Class
 * Adds a sound system to the string representation of a vehicle and adds to the cost
 * @author ddkeen
 */
public class SoundSystem extends VehicleDecorator {

    private Vehicle vehicle;

    /**
     * Takes in a Vehicle object and makes it the SoundSystem object's private instance variable so it's description and cost can be altered
     * @param vehicle the vehicle to be altered
     */
    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

     /**
     * Gives a String representation of the Vehicle with a new sound system
     * @return a String representation of the changed Vehicle
     */
    public String toString() {
        return vehicle.toString() + ", awesome sound";
    }

    /**
     * Gives the cost of the Vehicle with the added cost of a new sound system
     * @return a double representation of the cost of the changed Vehicle
     */
    public double getCost() {
        return vehicle.getCost() + 350;
    }
    
}