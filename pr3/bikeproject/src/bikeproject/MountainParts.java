package bikeproject;

interface MountainParts {
    String TERRAIN = "off_road";
    //**getSuspension**, **setSuspension**, **getType**, **setType**.
    void setSuspension(String newValue);
    void setType(String newValue);
    String getSuspension();
    String getType();
}
