package weekTen.interfaces.abstractClasses;

import weekNine.PropertyListing;

public class tester2 {
    public static void main(String[] args) {
        ResidentialProperty residentialProperty = new ResidentialProperty("Downtown", 1999.99, 660, "2089 Bull Way");
        CommercialProperty commercialProperty = new CommercialProperty("Downtown", 1999.99, 660, "Bakery", 89);
        residentialProperty.setHasBasement(true);
        residentialProperty.setNumOfBathrooms(4);
        residentialProperty.setNumOfBedrooms(3);
        residentialProperty.display();
        System.out.println(commercialProperty.marketPerception());
        commercialProperty.display();
        residentialProperty.setUsername("Bob smith");
        residentialProperty.setPassword("bro");
        residentialProperty.login();
    }
}
