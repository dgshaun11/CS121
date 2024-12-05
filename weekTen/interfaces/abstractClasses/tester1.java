package weekTen.interfaces.abstractClasses;

public class tester1 {
    public static void main(String[] args) {
        ForSaleProperty forSale = new ForSaleProperty();
        ForRentProperty forRent = new ForRentProperty();
        forSale.listProperties();
        forSale.filters("Downtown");
        forSale.display();
        forRent.listProperties();
        forRent.filters("Village");
        forRent.display();
    }
}
