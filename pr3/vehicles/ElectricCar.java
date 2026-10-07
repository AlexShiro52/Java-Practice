package pr3.vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    private int BatteryCapacity;
    public String vehicleType() {
        return "Electric Car";
    }
    public int getBatteryCapacity() {
        return BatteryCapacity;
    }
    public void setBatteryCapacity(int BatteryCapacity) {
        this.BatteryCapacity = BatteryCapacity;
    }
    public ElectricCar(String ownerName, int year, int BatteryCapacity, int insuranceNumber) {
        super(ownerName, year, insuranceNumber);
        this.engineType = "Electric";
        this.BatteryCapacity = 100;
    }
    @Override
    public String toString() {
        return super.toString() + " " + BatteryCapacity;
    }
}
