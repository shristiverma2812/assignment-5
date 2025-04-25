//Write a Java program to sort an array of integers in descending order.

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 8, 1, 2, 7, 6, 4};

        System.out.println("Original Array: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));
    }
}

//Original Array: [5, 3, 8, 1, 2, 7, 6, 4]
//Sorted Array (Descending): [8, 7, 6, 5, 4, 3, 2, 1]
