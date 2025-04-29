package com.bruno.santana.valid_parentheses;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
// My solution: https://leetcode.com/problems/valid-parentheses/submissions/1620865063/

public class Solution {

    public boolean isValid(String s) {

        if (s == null || s.length() == 1) {
            return false;
        }

        int openingCount = 0;
        int closingCount = 0;
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                openingCount++;
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                closingCount++;
                Character charOnTop = stack.pop();
                switch (c) {
                    case ')':
                        if (charOnTop != '(') return false;
                        break;
                    case ']':
                        if (charOnTop != '[') return false;
                        break;
                    case '}':
                        if (charOnTop != '{') return false;
                        break;
                }
            }
        }

        return openingCount == closingCount;
    }

}
