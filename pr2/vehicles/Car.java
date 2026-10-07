package vehicles;

public class Car extends Vehicle {
    public Car(String ownerName, int insuranceNumber) {
        set_ownerName(ownerName);
        set_insuranceNumber(insuranceNumber);
    }
    public String vehicleType() {
        return "Car";
    }
}
