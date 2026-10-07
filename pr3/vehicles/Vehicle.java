package pr3.vehicles;

public abstract class Vehicle {
    private String model;
    private int license;
    private String color;
    private int year;
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;
    public String get_model() {
        return model;
    }
    public void set_model(String model) {
        this.model = model;
    }
    public int get_license() {
        return license;
    }
    public void set_license(int license) {
        this.license = license;
    }
    public String get_color() {
        return color;
    }
    public void set_color(String color) {
        this.color = color;
    }
    public int get_year() {
        return year;
    }
    public void set_year(int year) {
        this.year = year;
    }
    public String get_ownerName() {
        return ownerName;
    }
    public void set_ownerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public int get_insuranceNumber() {
        return insuranceNumber;
    }
    public void set_insuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public String get_engineType() {
        return model;
    }
    public void set_engineType(String engineType) {
        this.engineType = engineType;
    }
    public abstract String vehicleType();
    public String toString() {
        return model + " " + license + " " + color + " " + year + " " + ownerName + " " + insuranceNumber + " " + engineType;
    }
}
