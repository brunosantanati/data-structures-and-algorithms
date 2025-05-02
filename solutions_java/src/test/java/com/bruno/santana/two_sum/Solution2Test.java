package com.bruno.santana.two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution2Test {

    @Test
    void testScenario1() {
        Solution2 solution = new Solution2();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    void testScenario2() {
        Solution2 solution = new Solution2();
        int[] result = solution.twoSum(new int[]{3, 2, 4}, 6);

        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    void testScenario3() {
        Solution2 solution = new Solution2();
        int[] result = solution.twoSum(new int[]{3, 3}, 6);

        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, result);
    }

}
