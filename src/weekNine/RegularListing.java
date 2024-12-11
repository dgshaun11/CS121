package weekNine;

public class RegularListing extends PropertyListing{

    public RegularListing(String propertyType, String location) {
        super(propertyType, location);
    }
    @Override
    public String toString(){
        return super.toString() + " (Standard Listing)";
    }
}
