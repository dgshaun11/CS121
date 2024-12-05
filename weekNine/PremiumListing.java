package weekNine;

public class PremiumListing extends PropertyListing {
    private String feature;

    public PremiumListing(String propertyType, String location, String feature){
        super(propertyType, location);
        this.feature = feature;
    }
    @Override
    public String toString(){
        return super.toString() + " Feature: " + feature;
    }
}
