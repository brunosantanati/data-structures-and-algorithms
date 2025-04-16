package com.bruno.santana.valid_palindrome;

// https://leetcode.com/problems/valid-palindrome/description/
// My solution: https://leetcode.com/problems/valid-palindrome/submissions/1608244670/

public class Solution {

    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String revertedString = "";

        int lastIndex = s.length() - 1;
        for (int i = lastIndex; i >= 0; i--) {
            revertedString += s.charAt(i);
        }

        System.out.println("original String: " + s);
        System.out.println("reverted String: " + revertedString);
        return s.equals(revertedString);
    }

}
