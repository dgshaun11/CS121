package weekThree;
import java.util.Arrays;
    public class SimpleQuickSort {
        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high);
            }}private static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low;

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }}int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
            return i;
        }public static void main(String[] args) {
            int[] array = {10, 7, 8, 9, 1, 5};
            System.out.println("Unsorted array: " + Arrays.toString(array));

            quickSort(array, 0, array.length - 1);

            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }

