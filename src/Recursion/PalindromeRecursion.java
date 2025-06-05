package Recursion;

import java.util.Arrays;

class CheckPalindromeRecursion {
    boolean isPalindrome(char[] str, int start, int end) {
        if (start >= end) return true; // base case: reached the middle
        if (str[start] != str[end]) return false; // mismatch
        return isPalindrome(str, start + 1, end - 1); // move inward
    }
}

public class PalindromeRecursion {
    public static void main(String[] args) {
        CheckPalindromeRecursion obj = new CheckPalindromeRecursion();
        String str = "Nitin";
        str.trim();
        char[] chars = str.toLowerCase().toCharArray(); // case-insensitive
        boolean result = obj.isPalindrome(chars, 0, chars.length - 1);
        System.out.println("Is palindrome: " + result);
    }
}
