package com.bruno.santana.reverse_string;

// https://leetcode.com/problems/reverse-string/
// My solution: https://leetcode.com/problems/reverse-string/submissions/1613012879/

public class Solution {

    public void reverseString(char[] s) {
        int halfSize = s.length / 2;

        for (int i = 0; i < halfSize; i++) {
            int indexToSwap = s.length - 1 - i;
            char temp = s[i];
            s[i] = s[indexToSwap];
            s[indexToSwap] = temp;
        }
    }

}
