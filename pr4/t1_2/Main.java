package pr4.t1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Введите сторону 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Введите сторону 3: ");
        double side3 = scanner.nextDouble();
        System.out.print("Введите цвет: ");
        String color = scanner.next();
        System.out.print("Треугольник закрашен? (true/false): ");
        boolean filled = scanner.nextBoolean();
        Triangle triangle1 = new Triangle();
        try {
            Triangle triangle2 = new Triangle(side1, side2, side3);
            triangle2.setColor(color);
            triangle2.isFilled(filled);
            System.out.println(triangle2.getArea());
            System.out.println(triangle2.getPerimeter());
            System.out.println(triangle2.getFilled());
            System.out.println(triangle2.getColor());
            System.out.println(triangle2.toString());
        } catch (IllegalTriangleException e) {
            System.out.println("Нельзя создать треугольник с такими сторонами.");
        }
        System.out.println(triangle1.toString());
        scanner.close();
    }
}
