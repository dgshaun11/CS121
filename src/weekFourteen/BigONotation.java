package weekFourteen;

public class BigONotation {
    //Time complexity
    //Space complexity
    //O(log n) Logarithmic time - the execution time grow logarithmically with the input size
    //O(n) - Linear time - execution grows linearly with the input size
    //O(n^2) - Quadratic time - The execution time grows quadratically with the input size
    public static void printNTimes(String [] array, int n){
        int count = 0;
        for (int i = 0; i <= n; i++){
            System.out.println("#" + (count +1) + "Internet History: ");
            count++;
        }
        System.out.println();
    }
    static String [] students = {"Alice", "Bob", "Charlie", "David", "Ella", "Frank", "Grace", "Hannah", "Ian", "Jack", "Katie"};
    public static void printOneTime(String name){
        System.out.println(name);
    }
    public static void printNSquaredTime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++){
            for (int j =1; j<=n; j++){
                System.out.println("#" + (count+1) + ": " + "The nested for loop count " + "i. "
                        + i + " The magicians" + " j " + j + "\n");
            }
        }
    }
    public static int binarySearch(String[] array, String value){
        int low = 0;
        int high = array.length-1;

        while (low <= high){
            int mid = low + (high - low)/2;
            int result = value.compareTo(array[mid]);

            if (result == 0){
                return mid;
            } else if (result >0){
                low = mid +1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int index = binarySearch(students, "Charlie");
        if (index != -1) {
            System.out.println("Nate is found at " + index);
        }
        printNSquaredTime(4);
    }
}
