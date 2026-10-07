package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;
    public int get_batteryCapacity() {
        return batteryCapacity;
    }
    public void set_batteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public String toString() {
        return super.toString() + " " + engineType;
    }
    public ElectricCar(String ownerName, int insuranceNumber, int batteryCapacity) {
        super(ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        this.engineType = "Electric";
    }
    public String vehicleType() {
        return "Electric Car";
    }
    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar("Alex", 67, 100);

        Car car2 = new Car("shiro", 52);

        System.out.println(car1.get_ownerName());
        System.out.println(car1.get_insuranceNumber());
        System.out.println(car1.get_engineType());
        System.out.println(car1.get_batteryCapacity());

        System.out.println(car2.get_ownerName());
        System.out.println(car2.get_insuranceNumber());
        System.out.println(car2.get_engineType());
    }
}
