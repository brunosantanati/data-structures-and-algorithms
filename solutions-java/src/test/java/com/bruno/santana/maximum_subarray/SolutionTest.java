package com.bruno.santana.maximum_subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testScenario1() {
        Solution solution = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testScenario2() {
        Solution solution = new Solution();
        int[] nums = {1};
        int expected = 1;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testScenario3() {
        Solution solution = new Solution();
        int[] nums = {5,4,-1,7,8};
        int expected = 23;
        int result = solution.maxSubArray(nums);
        assertEquals(expected, result);
    }

}
