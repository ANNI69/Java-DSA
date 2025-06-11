package Hashing;

import java.util.HashMap;

public class ArrayHashing {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1, 2};

        // Create a HashMap to store element frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Traverse the array once → O(n)
        for (int num : arr) {
            // If number already in map, increase its count
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequencies
        System.out.println("Element frequencies:");
        for (int key : freqMap.keySet()) {
            System.out.println("Element: " + key + ", Frequency: " + freqMap.get(key));
        }
    }
}
