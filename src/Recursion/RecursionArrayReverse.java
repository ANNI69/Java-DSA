package Recursion;

import java.util.Arrays;

class Recursion {

    void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

    void RecursiveReverse(int[] arr, int start, int end) {
        if(start >= end) return;
        swap(arr, start, end);
        RecursiveReverse(arr, start +1, end-1);
        System.out.println(Arrays.toString(arr));
    }
}

public class RecursionArrayReverse {
    public static void main(String[] args) {
        Recursion obj = new Recursion();
        int[] arr = {10, 20, 30, 40, 50, 60};
        int start = 0;
        int end = arr.length - 1;
        obj.RecursiveReverse(arr,start,end);
    }

}
