package setAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RealEstateSet {
    Set<String> propertyListings = new HashSet<>();

    public void addProperties(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter property IDs to add (enter '0' to quit):");
        try {
            while (true) {
                String id = sc.nextLine();
                if (id.equals("0")){
                    return;
                } else {
                    propertyListings.add(id);
                }
            }
        }catch (NumberFormatException e){
                System.out.println("doesn't work");
        }
    }
    public void displayProperties(){
        Iterator<String> iter = propertyListings.iterator();
        System.out.println("Property Listings:");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
