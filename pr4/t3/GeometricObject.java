package pr4.t3;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private Date dateCreated;
    public abstract double getArea();
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void isFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean getFilled() {
        return this.filled;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    public String toString() {
        return color + " " + filled + " " + dateCreated;
    }
    public GeometricObject() {
        dateCreated = new Date();
    }
    public int compareTo(GeometricObject other) {
        return Double.compare(this.getArea(), other.getArea());
    }
    public static GeometricObject max(GeometricObject first, GeometricObject second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}
