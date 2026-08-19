package com.bruno.santana.largest_palindromic_number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void testScenario1() {
        String result = solution.largestPalindromic("444947137");
        assertEquals("7449447", result);
    }

    @Test
    void testScenario2() {
        String result = solution.largestPalindromic("00009");
        assertEquals("9", result);
    }
}
