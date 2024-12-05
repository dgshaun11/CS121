package weekTen.interfaces.abstractClasses;

import weekTen.interfaces.Listable;

public class ForSaleProperty extends Property implements Listable {
    AddressBook addressBook = new AddressBook();
    @Override
    public void listProperties() {
        for(int row = 0; row < addressBook.size();row++){
            System.out.println(addressBook.get(row));
        }
        System.out.println();
    }
    public AddressBook filters(String filter){
        for (int row = addressBook.size()-1; row >= 0; row--){
                if (addressBook.get(row).contains(filter)){
                    addressBook.remove(row);
            }
        }
        return addressBook;
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
