package pr4.t4;

public class Square extends GeometricObject implements Colorable {
    private double side = 0;
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }
    public double getArea() {
        return side * side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return this.side;
    }
    public Square() { 
    }
    public Square(double side) {
        this.side = side;
    }
}
