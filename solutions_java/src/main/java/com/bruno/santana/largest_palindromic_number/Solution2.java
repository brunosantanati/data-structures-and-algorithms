package com.bruno.santana.largest_palindromic_number;

// https://leetcode.com/problems/largest-palindromic-number/description/
// My Solution: https://leetcode.com/problems/largest-palindromic-number/submissions/2114438246/

public class Solution2 {

    public String largestPalindromic(String num) {
        // Step 1: Count frequency of each digit (0-9)
        int[] freq = new int[10];
        for (char c : num.toCharArray()) {
            freq[c - '0']++;
            // freq[Character.getNumericValue(c)]++; //slower alternative
        }

        StringBuilder leftHalf = new StringBuilder();
        String middle = "";

        // Step 2: Build the left half greedily (from 9 down to 0)
        for (int digit = 9; digit >= 0; digit--) {
            if (digit == 0 && leftHalf.isEmpty()) {
                break;
            }

            int pairs = freq[digit] / 2;
            leftHalf.append(String.valueOf(digit).repeat(pairs));

            freq[digit] %= 2;
        }

        // Step 3: Find the largest digit available for the center
        for (int digit = 9; digit >= 0; digit--) {
            if (freq[digit] > 0) {
                middle = String.valueOf(digit);
                break;
            }
        }

        // Step 4: Combine left half + middle + reversed left half
        StringBuilder rightHalf = new StringBuilder(leftHalf).reverse();
        return leftHalf.append(middle).append(rightHalf).toString();
    }

}
