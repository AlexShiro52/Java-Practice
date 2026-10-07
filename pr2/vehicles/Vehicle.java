package vehicles;

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
    public String get_color() {
        return color;
    }
    public String get_ownerName() {
        return ownerName;
    }
    public String get_engineType() {
        return engineType;
    }
    public int get_license() {
        return this.license;
    }
    public int get_year() {
        return this.year;
    }
    public int get_insuranceNumber() {
        return this.insuranceNumber;
    }
    public void set_model(String model) {
        this.model = model;
    }
    public void set_color(String color) {
        this.color = color;
    }
    public void set_ownerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void set_engineType(String engineType) {
        this.engineType = engineType;
    }
    public void set_license(int license) {
        this.license = license;
    }
    public void set_year(int year) {
        this.year = year;
    }
    public void set_insuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public abstract String vehicleType();
    public String toString() {
        return model + " " + license + " " + color + " " + year + " " + ownerName + " " + insuranceNumber + " " + engineType;
    }
}
