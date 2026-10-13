package pr4.t1_2;

import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;
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
}
