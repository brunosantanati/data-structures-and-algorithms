package com.bruno.santana.valid_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution2Test {

    Solution2 solution = new Solution2();

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
