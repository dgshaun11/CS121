package weekNine;

public class ListingTesting {
    public static void main(String[] args){
        PropertyListing property1 = new PropertyListing("House","Downtown");
        PremiumListing property2 = new PremiumListing("Apartment", "Suburbs", "Swimming Pool");
        RegularListing property3 = new RegularListing("Hotel", "Downtown");
        System.out.println(property3.toString());
        System.out.println(property2.toString());
        System.out.println(property1.toString());
    }
}
