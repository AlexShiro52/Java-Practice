public class Car {
    private static final int temp_year = 2026;
    String model;
    String license;
    String color;
    int year;
    public Car() {}
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public void To_String() {
        System.out.println(model);
        System.out.println(license);
        System.out.println(color);
        System.out.println(year);
    }
    public String getModel() {
        return model;
    }
    public String getLicense() {
        return license;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int Car_age() {
        return temp_year - year;
    }
}
