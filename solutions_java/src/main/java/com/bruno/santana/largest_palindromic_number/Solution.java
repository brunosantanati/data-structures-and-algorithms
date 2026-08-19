package com.bruno.santana.largest_palindromic_number;

public class Solution {

    public String largestPalindromic(String num) {
        // Step 1: Count frequency of each digit (0-9)
        int[] freq = new int[10];
        for (char c : num.toCharArray()) {
            freq[c - '0']++;
        }

        StringBuilder leftHalf = new StringBuilder();
        String middle = "";

        // Step 2: Build the left half greedily (from 9 down to 0)
        for (int digit = 9; digit >= 0; digit--) {
            // Avoid adding leading zeros to the left half
            if (digit == 0 && leftHalf.length() == 0) {
                break;
            }

            int pairs = freq[digit] / 2;
            for (int i = 0; i < pairs; i++) {
                leftHalf.append(digit);
            }

            freq[digit] %= 2; // Keep remaining remainder (0 or 1)
        }

        // Step 3: Find the largest digit available for the center
        for (int digit = 9; digit >= 0; digit--) {
            if (freq[digit] > 0) {
                middle = String.valueOf(digit);
                break; // First one found is the largest
            }
        }

        // Step 4: Edge Case - If leftHalf is empty and no middle was found (e.g., only '0's were provided)
        if (leftHalf.length() == 0 && middle.isEmpty()) {
            return "0";
        }

        // Step 5: Combine left half + middle + reversed left half
        StringBuilder rightHalf = new StringBuilder(leftHalf).reverse();
        return leftHalf.append(middle).append(rightHalf).toString();
    }

}
