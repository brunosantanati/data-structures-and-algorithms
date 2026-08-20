package com.bruno.santana.largest_palindromic_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void testScenario1() {
        String result = solution2.largestPalindromic("444947137");
        assertEquals("7449447", result);
    }

    @Test
    void testScenario2() {
        String result = solution2.largestPalindromic("00009");
        assertEquals("9", result);
    }

    @Test
    void testScenario3() {
        String result = solution2.largestPalindromic("00000");
        assertEquals("0", result);
    }

    @Test
    void testScenario4() {
        String result = solution2.largestPalindromic("0000");
        assertEquals("0", result);
    }

    @Test
    void testScenario5() {
        String result = solution2.largestPalindromic("00");
        assertEquals("0", result);
    }

    @Test
    void testScenario6() {
        String result = solution2.largestPalindromic("7700");
        assertEquals("7007", result);
    }
}
