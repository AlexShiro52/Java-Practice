package bikeproject;

interface RoadParts {
    String terrain = "track_racing";
    //**getTyreWidth**, **setTyreWidth**, **getPostHeight**, **setPostHeight**
    void setTyreWidth(int newValue);
    void setPostHeight(int newValue);
    int getTyreWidth();
    int getPostHeight();
}
