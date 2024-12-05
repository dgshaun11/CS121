package weekTen.interfaces.abstractClasses;

import java.util.ArrayList;

public class ApartmentBook {
    public ArrayList<ArrayList<String>> apartments = new ArrayList<>();
    public ApartmentBook(){
        ArrayList<String> address1 = new ArrayList<>();
        address1.add("603 Dicks St");
        address1.add("Campus");
        ArrayList<String> address2 = new ArrayList<>();
        address2.add("6172 Bowling Rd");
        address2.add("Campus");
        ArrayList<String> address3 = new ArrayList<>();
        address3.add("1922 Longbottom Ave");
        address3.add("Village");
        ArrayList<String> address4 = new ArrayList<>();
        address4.add("1717 Kings Court Rd");
        address4.add("Downtown");
        apartments.add(address1);
        apartments.add(address2);
        apartments.add(address3);
        apartments.add(address4);
    }
    public int size(){
        return apartments.size();
    }

    public ArrayList<String> get(int index) {
        return apartments.get(index);
    }
    public void remove(int index){
        apartments.remove(index);
    }
}

