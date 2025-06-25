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
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (arr[j] < largest && arr[j] > secondLargest) {
                secondLargest = arr[j];
            }
        }
        return secondLargest;
    }

    int secondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > smallest) {
                smallest = secondSmallest;
                secondSmallest = i;
            } else if (i != secondSmallest && i < smallest) {
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

    int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    int findFirstOc(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    int findLastOc(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target){
        int first = findFirstOc(nums, target);
        int last = findLastOc(nums, target);
        return new int[]{first, last};
    }

    int[] rotateLeftByD(int[] nums, int d) {
        int n = nums.length;
        d = d % n; // handle d > n
        int[] temp = new int[d];
        // Step 1: Copy first d elements
        for (int i = 0; i < d; i++) {
            temp[i] = nums[i];
        }
        // Step 2: Shift remaining elements to the left
        for (int i = d; i < n; i++) {
            nums[i - d] = nums[i];
        }
        // Step 3: Copy temp elements to the end
        for (int i = 0; i < d; i++) {
            nums[n - d + i] = temp[i];
        }
        return nums;
    }

    int[] rotateLeftByOne(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    public static void main(String[] args) {
        Easy easy = new Easy();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(easy.rotateLeftByOne(arr)));
    }
}
