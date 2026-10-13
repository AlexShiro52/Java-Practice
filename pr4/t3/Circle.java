package pr4.t3;

public class Circle extends GeometricObject {
    private double radius = 1.0;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        isFilled(filled);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getDiameter() {
        return radius * 2;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public void printCircle() {
        System.out.println("Радиус: " + radius);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Цвет: " + getColor());
        System.out.println("Закрашен: " + getFilled());
    }
}
