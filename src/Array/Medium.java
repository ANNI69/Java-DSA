package Array;

import java.util.*;

public class Medium {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public int[] twosum(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    } // returns positions

    public int[] twosumHashmap(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int rem = 0;
        for (int i = 0; i < arr.length; i++) {
            rem = k - arr[i];
            if (!map.containsKey(rem)) {
                map.put(arr[i], i);
            } else {
                return new int[]{map.get(rem), i};
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSumOptimal(int[] nums, int k) {
        int[] arr = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(arr));
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < k) {
                left++;
            } else if (sum > k) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }
        return null;
    }

    public int[] sortZeroOneTwo(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            nums[i] = 1;
        }
        for (int i = count0 + count1; i < nums.length; i++) {
            nums[i] = 2;
        }
        return nums;
    }


    public static void main(String[] args) {
        Medium m = new Medium();
        System.out.println(Arrays.toString(m.sortZeroOneTwo(new int[]{1, 0, 2, 1, 0})));
    }
}
