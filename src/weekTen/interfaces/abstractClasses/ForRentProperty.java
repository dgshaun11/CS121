package weekTen.interfaces.abstractClasses;

import weekTen.interfaces.Listable;

public class ForRentProperty extends Property implements Listable {
    ApartmentBook apartmentBook = new ApartmentBook();
    @Override
    public void listProperties() {
        for (int row = 0; row < apartmentBook.size(); row++){
            System.out.println(apartmentBook.get(row));
        }
        System.out.println();
    }

    public ApartmentBook filters(String filter) {
        for (int row = apartmentBook.size()-1; row >= 0; row--){
            if (apartmentBook.get(row).contains(filter)){
                apartmentBook.remove(row);
            }
        }
        return apartmentBook;
    }

    @Override
    public void display() {
        System.out.println("Type 1 to display properties");
        int input = sc.nextInt();
        if (input == 1){
            listProperties();
        }
    }
}
