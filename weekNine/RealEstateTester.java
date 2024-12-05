package weekNine;

public class RealEstateTester {
    public static void main(String[] args){
        realEstate estate1 = new realEstate(998877, 10000001);
        realEstate estate2 = new realEstate("Apartment", "Suburbs😂", estate1.incrementReserve());
        realEstate estate3 = new realEstate("House", "Downtown", estate2.incrementReserve());
        estate1.setPrice(1550.25);
        estate2.setPrice(3000.99);
        estate1.searchProperties();
        estate1.startUp(true);
        estate2.searchProperties();
        estate2.startUp(false);
    }
}
