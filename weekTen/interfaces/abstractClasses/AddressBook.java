package weekTen.interfaces.abstractClasses;

import java.util.ArrayList;

public class AddressBook {
    public ArrayList<ArrayList<String>> addresses = new ArrayList<>();// i realize i can actaully make an arraylist of objects instead of doing this
    // the object would be address with attributes address and location
    // what i really should do is make a class that has attributes location and address and then make an array list of addresses and simply just do .add("location","address")
    //
    public ArrayList<ArrayList<String>> apartments = new ArrayList<>();
    public AddressBook(){
        ArrayList<String> address1 = new ArrayList<>();
        address1.add("1234 Bowling Rd");
        address1.add("Downtown");
        ArrayList<String> address2 = new ArrayList<>();
        address2.add("5322 Green St");
        address2.add("Suburbs");
        ArrayList<String> address3 = new ArrayList<>();
        address3.add("7134 Storing Ave");
        address3.add("Slums");
        ArrayList<String> address4 = new ArrayList<>();
        address4.add("9140 Mount Rd");
        address4.add("Downtown");
        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        addresses.add(address4);
    }
    public int size(){
       return addresses.size();
    }

    public ArrayList<String> get(int index) {
        return addresses.get(index);
    }
    public void remove(int index){
        addresses.remove(index);
    }
}
