package com.bruno.santana.valid_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testScenario1() {
        boolean result = solution.isAnagram("anagram", "nagaram");
        assertTrue(result);
    }

    @Test
    void testScenario2() {
        boolean result = solution.isAnagram("rat", "car");
        assertFalse(result);
    }

}
