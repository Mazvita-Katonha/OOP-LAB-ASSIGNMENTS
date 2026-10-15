package Lab08_Collections;



import java.util.Arrays;

public class BubbleSortChallenge {

    // Generic Bubble Sort method restricted to types that implement Comparable
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // compareTo returns positive if arr[j] is larger than arr[j+1]
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap elements
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped in the inner loop, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Lab 8 Challenge: Generic Bubble Sort ---");

        // 1. Testing with an Integer array (Wrapper Objects)
        Integer[] scores = {85, 92, 45, 78, 63};
        System.out.println("Before sorting (Integer): " + Arrays.toString(scores));
        bubbleSort(scores);
        System.out.println("After sorting (Integer):  " + Arrays.toString(scores));

        System.out.println();

        // 2. Testing with a String array
        String[] names = {"Zodwa", "Anesu", "Moyo", "Chipo"};
        System.out.println("Before sorting (String): " + Arrays.toString(names));
        bubbleSort(names);
        System.out.println("After sorting (String):  " + Arrays.toString(names));
    }
}


