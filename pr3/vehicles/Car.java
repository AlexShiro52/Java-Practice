package pr3.vehicles;

public class Car extends Vehicle {
    public Car(String ownerName, int year, int insuranceNumber) {
        set_ownerName(ownerName);
        set_year(year);
        set_insuranceNumber(insuranceNumber);
        this.engineType = "Combustion";
    }
    public String vehicleType() {
        return "Car";
    }
}
