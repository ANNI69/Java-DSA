package a0_Tests;

import java.util.Arrays;

public class Solution {

    int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(new int[]{solution.removeDuplicates(new int[]{1,1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9})}));
    }
}

