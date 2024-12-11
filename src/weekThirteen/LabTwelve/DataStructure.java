package weekThirteen.LabTwelve;

import java.util.*;
// the point of generics is to prevent unneeded code such as making multiple overloaded methods for strings, ints, doubles, etc.

public class DataStructure<E> {
    private int  ageIndex = 0;
    private ArrayList<E> studentList = new ArrayList<>();
    private final int SIZES = 3;
    private E [] ageList = (E[]) new Object[SIZES];
    private HashMap<E, E> majorGpaMap = new HashMap<>();
    private LinkedList<E> nationalityList = new LinkedList<>();
    private Stack<E> hometownStack = new Stack<>();
    private Queue<E> homeStateQueue = new LinkedList<>();


    //array
    public void addArray(E age){
        if (ageIndex < ageList.length){
            ageList[ageIndex++] = age;
        }
    }
    public void addArrayList(E student){
        studentList.add(student);
    }
    public void put(E s, E d){
        majorGpaMap.put(s,d);
    }
    public void addLinkedList(E s){
        nationalityList.add(s);
    }
    public void addStack(E s){
        hometownStack.push(s);
    }
    public void addQueue(E s){
        homeStateQueue.offer(s);
    }

    public void removeAge(){
        if (ageIndex > 0){
            ageList[--ageIndex] = null;
        }
    }
    public void remove(E s){
        studentList.remove(s);
    }
    public void remove(E s, E d){
        majorGpaMap.remove(s,d);
    }
    public void remove(){
        nationalityList.remove();
    }
    public void removeQueue(){
        homeStateQueue.remove();
    }
    public void pop(){
        hometownStack.pop();
    }

    public void displayArray(){
        for (int i = 0; i < ageList.length-1; i++) {
            System.out.println(ageList[i]);
        }
    }
    public void displayArrayList(){
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
    }
    public void displayHashMap(){
        majorGpaMap.forEach((key, value) -> { System.out.println(key);
            System.out.println(value);
        });
    }
    public void displayLinkedList(){
        for (int i =0; i < nationalityList.size(); i++){
            System.out.println(nationalityList.get(i));
        }
    }
    public void displayStack(){
        for(int i = 0; i < hometownStack.size(); i++){
            System.out.println(hometownStack.pop());
        }
    }
    public void displayQueue(){
        for (int i = 0; i < homeStateQueue.size(); i++){
            System.out.println(homeStateQueue.poll());
        }
    }
}
