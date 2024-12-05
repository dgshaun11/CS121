package weekSeven;

public class testClass {
    public static void main(String[] args){
        classTwo location = new classTwo();
        classOne credit = new classOne();

        credit.setBankCredit(1500.35);
        credit.getBankCredit();
        credit.setName("Shaun");
        credit.getName();
        credit.setYears(10);
        credit.getYears();
        credit.print();

        location.setCity("Fort Wayne");
        location.getCity();
        location.setCountry("USA");
        location.setState("Indiana");
        location.print();

    }
}
