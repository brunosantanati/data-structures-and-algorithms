package com.bruno.santana.reverse_string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void testScenario1() {
        Solution solution = new Solution();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(input);
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        assertResult(expected, input);
    }

    @Test
    void testScenario2() {
        Solution solution = new Solution();
        char[] input = {'H','a','n','n','a','h'};
        solution.reverseString(input);
        char[] expected = {'h','a','n','n','a','H'};
        assertResult(expected, input);
    }

    private void assertResult(char[] expected, char[] input) {
        assertArrayEquals(expected,
                input,
                String.format("String not reversed correctly: expected %s, but got %s", Arrays.toString(expected), Arrays.toString(input)));
    }

}
