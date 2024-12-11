package weekFive;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of elements");
        int NUM_ELEMENTS = sc.nextInt();

        int[] array1 = new int[NUM_ELEMENTS];
        int[] array2 = new int[NUM_ELEMENTS];
        int[] array3 = new int[NUM_ELEMENTS];
        int[] array4 = new int[NUM_ELEMENTS];

        int j = 0;

        for (int i = 0; i < array1.length; i++){
            System.out.println("Please enter a number: ");
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for ( int i = 0; i < array2.length; i++){
            array2[i] = array1[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++){
            array3[i] = array1[i] * array1[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array4.length; i++)
        {
            array4[i] = array1[array1.length - i -1];
            System.out.print(array4[i] + " ");
        }
    }
}
