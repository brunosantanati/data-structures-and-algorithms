package com.bruno.santana.valid_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void testScenario1() {
        final String s = "A man, a plan, a canal: Panama";

        Solution solution = new Solution();
        boolean result = solution.isPalindrome(s);

        assertTrue(result);
    }

    @Test
    void testScenario2() {
        final String s = "race a car";

        Solution solution = new Solution();
        boolean result = solution.isPalindrome(s);

        assertFalse(result);
    }

    @Test
    void testScenario3() {
        final String s = " ";

        Solution solution = new Solution();
        boolean result = solution.isPalindrome(s);

        assertTrue(result);
    }

}
