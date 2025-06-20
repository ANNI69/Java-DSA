package Array;

import java.util.Arrays;

public class Easy {
    int largestElement(int[] arr) {
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        return sorted[sorted.length - 1];
    } // Largest element in an array

    int secondLargestElement(int[] arr) {
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        int largest = sorted[sorted.length - 1];
        for (int i = sorted.length - 2; i >= 0; i--) {
            if (sorted[i] != largest) {
                return sorted[i];
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arrUnsorted = {12, 23, 23, 13, 14, 56, 78, 1, 9};
        int[] arrSorted = {1, 2, 3, 4, 5, 5, 6, 7, 9, 9};
        Easy arr = new Easy();
        System.out.println(arr.largestElement(arrUnsorted));
        System.out.println(arr.secondLargestElement(arrSorted));

    }
}
