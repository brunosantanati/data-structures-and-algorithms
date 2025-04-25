package com.bruno.santana.remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testScenario1() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2};
        int result = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        assertEquals(2, result);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
    }

    @Test
    void testScenario2() {
        Solution solution = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        assertEquals(5, result);
        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(2, nums[2]);
        assertEquals(3, nums[3]);
        assertEquals(4, nums[4]);
    }

}
