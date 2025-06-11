package Hashing;

public class CharectorHashing {
    public static void main(String[] args) {
        String str = "characterhashingexample";

        // Create an array of size 26 for lowercase letters
        int[] freq = new int[26];

        // Traverse the string and increase frequency
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;  // Hashing step: map char to index
        }

        // Print frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char)(i + 'a');  // Map index back to character
                System.out.println("Character: " + ch + ", Frequency: " + freq[i]);
            }
        }
    }
}
