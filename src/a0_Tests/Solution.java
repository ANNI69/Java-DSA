//package a0_Tests;
//
////import java.util.HashMap;
//import java.util.Map;
//
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i=0; i<s.length(); i++){
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
//    }
//}