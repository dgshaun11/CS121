package ArrayListDemo;

import java.util.ArrayList;

public class SystemManagement {
    protected static ArrayList<String> array1 = new ArrayList<>();
    protected ArrayList<String> array2 = new ArrayList<>();
    protected ArrayList<String> array3 = new ArrayList<>();

    public void add(ArrayList array,String name){
        array.add(name);
    }
    public void remove(ArrayList array, int index){
        array.remove(index);
    }
    public void size(ArrayList array){
        array.size();
    }
    public void getElement(ArrayList array, String element){
        if (array.contains(element)){
            array.remove(element);
        }
    }
    public static void display(ArrayList array){
        for (Object element : array){
            System.out.println(element);
        }
    }
    public void display2(ArrayList array){
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
