package com.bruno.santana.two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void testScenario1() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        int[] expected = new int[]{0, 1};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testScenario2() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{3, 2, 4}, 6);

        int[] expected = new int[]{1, 2};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testScenario3() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{3, 3}, 6);

        int[] expected = new int[]{0, 1};
        Assertions.assertArrayEquals(expected, result);
    }

}
