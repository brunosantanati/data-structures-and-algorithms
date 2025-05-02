package com.bruno.santana.valid_anagram;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/valid-anagram/description/
// My solution: https://leetcode.com/problems/valid-anagram/submissions/1622526739/

public class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = countNumberOfEachChar(s);
        Map<Character, Integer> mapT = countNumberOfEachChar(t);

        System.out.println(mapS);
        System.out.println(mapT);

        for (Map.Entry<Character, Integer> entry : mapS.entrySet()) {
            Character currentChar = entry.getKey();
            if (mapT.containsKey(currentChar)) {
                if (entry.getValue() != mapT.get(currentChar).intValue()) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    private Map<Character, Integer> countNumberOfEachChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (map.containsKey(currentChar)) {
                Integer count = map.get(currentChar);
                map.put(currentChar, ++count);
            } else {
                map.put(currentChar, 1);
            }
        }

        return map;
    }

}
