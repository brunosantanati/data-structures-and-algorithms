package com.bruno.santana.contains_duplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution2Test {

    @Test
    void testScenario1() {
        Solution2 solution = new Solution2();
        int[] nums = {1, 2, 3, 1};
        boolean result = solution.containsDuplicate(nums);
        boolean expected = true;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testScenario2() {
        Solution2 solution = new Solution2();
        int[] nums = {1, 2, 3, 4};
        boolean result = solution.containsDuplicate(nums);
        boolean expected = false;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testScenario3() {
        Solution2 solution = new Solution2();
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result = solution.containsDuplicate(nums);
        boolean expected = true;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testScenario4() {
        Solution2 solution = new Solution2();
        int[] nums = {7, 2, 1, 1};
        boolean result = solution.containsDuplicate(nums);
        boolean expected = true;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testScenario5() {
        Solution2 solution = new Solution2();
        int[] nums = {0, 1, 2, 3, 4};
        boolean result = solution.containsDuplicate(nums);
        boolean expected = false;
        Assertions.assertEquals(expected, result);
    }

    // This scenario is failing in Leetcode: Time Limit Exceeded
    @Test
    void testScenario6() throws IOException, OutOfMemoryError {
        Solution2 solution = new Solution2();

        String line = Files.readString(Path.of("src/test/java/com/bruno/santana/contains_duplicate/array_numbers.txt"));
        String[] parts = line.split(",");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }
        boolean result = solution.containsDuplicate(nums);
        boolean expected = false;
        Assertions.assertEquals(expected, result);
    }

}
