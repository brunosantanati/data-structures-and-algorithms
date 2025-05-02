package com.bruno.santana.valid_anagram;

/*
Time & Space Complexity:
Time: O(n)
Space: O(1) (since alphabet size is fixed at 26)
 */

public class Solution2 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) return false;
        }

        return true;
    }

}

