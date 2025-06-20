package a0_Tests;

import java.util.Arrays;

public class Solution {
    public int largestElement(int[] arr) {
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        return arr[sorted.length - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestElement(new int[]{1, 2, 3, 4, 5}));
    }
}

// if Quick Sort Then TC = O(n log n)
// if Quick Sort Then SC = O(1)
