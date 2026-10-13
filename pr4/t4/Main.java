package pr4.t4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeometricObject[] objects = {
            new Circle(2),
            new Rectangle(3, 4),
            new Triangle(),
            new Square(5),
            new Circle(4)
        };
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].getArea());
            if (objects[i] instanceof Colorable) {
                ((Colorable)objects[i]).howToColor();
            }
        }
        scanner.close();
    }
}
