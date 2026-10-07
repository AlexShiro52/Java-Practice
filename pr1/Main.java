public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("AUDI", 2007);

        Car car2 = new Car("BMW", "A123BC", "Black", 2025);

        Car car3 = new Car("AUDI", 2020);

        car2.To_String();
        car3.To_String();

        System.out.println(car2.Car_age());
        System.out.println(car1);
    }
}
