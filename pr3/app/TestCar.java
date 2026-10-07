package pr3.app;

import pr3.vehicles.*;

public class TestCar {
    public static void main(String[] args) {
        Vehicle Car = new Car("Alex Shiro", 2007, 6752);
        Vehicle ElectricCar = new ElectricCar("Alex", 2026, 100, 5267);
        ElectricCar elec_car_2 = new ElectricCar("who", 2000, 67, 485034);
        System.out.println(Car.toString());
        System.out.println(ElectricCar.toString());
        Car.set_year(2010);
        ElectricCar.set_ownerName("Egor");
        Car.set_insuranceNumber(55555);
        System.out.println(elec_car_2.getBatteryCapacity());
        System.out.println(Car.toString());
        System.out.println(ElectricCar.toString());
        System.out.println(elec_car_2.toString());
    }
}
