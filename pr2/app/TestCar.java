package app;

import vehicles.*;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car("alex shiro", 67);
        Vehicle elec_car = new ElectricCar("alex shiro", 52, 100);
        System.out.println(car.toString());
        System.out.println(elec_car.toString());
        car.set_ownerName("hype");
        elec_car.set_insuranceNumber(100);
        System.out.println(car.toString());
        System.out.println(elec_car.toString());
    }
}
