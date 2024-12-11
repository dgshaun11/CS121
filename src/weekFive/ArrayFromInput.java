package weekFive;
import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int NUM_ELEMENTS =3;
        int[] ages = new int[NUM_ELEMENTS];
        String[] names = new String[NUM_ELEMENTS];
        int[] grades = new int[NUM_ELEMENTS];
        for (int i = 0; i <NUM_ELEMENTS; i++){
            System.out.println((i+1)+" .Enter name :");
            names[i] = sc.nextLine();
            System.out.println((i+1)+" .Enter age :");
            ages[i] = sc.nextInt();
            System.out.println((i+1)+" .Enter grade :");
            grades[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("NAME AGE GRADE");
        for(int i =0; i<NUM_ELEMENTS; i++)
        {
            System.out.print(names[i] + " " + ages[i] + " " + grades[i]);
        }
    }
}
