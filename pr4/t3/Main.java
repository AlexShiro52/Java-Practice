package pr4.t3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius1 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();
        GeometricObject circle1 = new ComparableCircle(radius1);
        GeometricObject circle2 = new ComparableCircle(radius2);
        GeometricObject rectangle1 = new Rectangle(width1, height1);
        GeometricObject rectangle2 = new Rectangle(width2, height2);
        System.out.println(GeometricObject.max(rectangle1, rectangle2));
        System.out.println(GeometricObject.max(circle1, circle2));
        System.out.println(circle1.compareTo(circle2));
        System.out.println(circle1.compareTo(rectangle1));
        scanner.close();
    }
}
