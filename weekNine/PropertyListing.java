package weekNine;

public class PropertyListing {
    private String propertyType;
    private String location;

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public PropertyListing(String propertyType, String location){
        this.propertyType = propertyType;
        this.location = location;
    }
    @Override
    public String toString(){
        return "Property: " + propertyType + ", Location: " + location;
    }
}
