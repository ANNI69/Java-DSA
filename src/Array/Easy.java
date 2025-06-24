package Array;

import java.util.Arrays;

public class Easy {
    int largestElement(int[] arr) {
        int largest = -1;
        for (int j : arr) {
            if (j > largest) {
                largest = j;
            }
        }
        return largest;
    }

    int secondLargestElement(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for (int j : arr) {
            if(j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (arr[j] < largest && arr[j] >secondLargest) {
                secondLargest = arr[j];
            }
        }
        return secondLargest;
    }

    int secondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i: arr){
            if(i> smallest){
                smallest = secondSmallest;
                secondSmallest = i;
            }else if(i != secondSmallest && i <smallest){
                secondSmallest = i;
            }
        }
        return secondSmallest;
    }

    int[] secondLargestSecondSmallest(int[] arr) {
        int slargest = secondLargestElement(arr);
        int ssmallest = secondSmallest(arr);
        return new int[]{slargest, ssmallest};
    } //O(n)

    boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i] && arr[i - 1] != arr[i]) {
                return false;
            }
        }
        return true;
    }  //O(n)



    public static void main(String[] args) {

    }
}
