/**
 * Abstract class that is the parent class of all Vehicle Decorator types of objects including Paint, Sound System, and Rims
 * Inherits from the Vehicle class, it takes a vehicle, adds attributes to it, then returns the result
 * @author ddkeen
 */
public abstract class VehicleDecorator extends Vehicle {

    /**
     * Abstract classs to append an attribute to the existing Vehicle. 
     * @return a String representation of the Vehicle after it has been given a certain attribute
     */
    public abstract String toString();
    
}
