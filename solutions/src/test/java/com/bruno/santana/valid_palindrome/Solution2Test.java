package com.bruno.santana.valid_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution2Test {

    @Test
    void testScenario1() {
        final String s = "A man, a plan, a canal: Panama";

        Solution2 solution = new Solution2();
        boolean result = solution.isPalindrome(s);

        assertTrue(result);
    }

    @Test
    void testScenario2() {
        final String s = "race a car";

        Solution2 solution = new Solution2();
        boolean result = solution.isPalindrome(s);

        assertFalse(result);
    }

    @Test
    void testScenario3() {
        final String s = " ";

        Solution2 solution = new Solution2();
        boolean result = solution.isPalindrome(s);

        assertTrue(result);
    }

}
