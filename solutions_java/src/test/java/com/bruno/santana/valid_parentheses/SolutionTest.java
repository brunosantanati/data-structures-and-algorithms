package com.bruno.santana.valid_parentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testScenario1() {
        boolean result = solution.isValid("()");
        Assertions.assertTrue(result);
    }

    @Test
    void testScenario2() {
        boolean result = solution.isValid("()[]{}");
        Assertions.assertTrue(result);
    }

    @Test
    void testScenario3() {
        boolean result = solution.isValid("(]");
        Assertions.assertFalse(result);
    }

    @Test
    void testScenario4() {
        boolean result = solution.isValid("([])");
        Assertions.assertTrue(result);
    }

    @Test
    void testScenario5() {
        boolean result = solution.isValid("[");
        Assertions.assertFalse(result);
    }

    @Test
    void testScenario6() {
        boolean result = solution.isValid("((");
        Assertions.assertFalse(result);
    }

    @Test
    void testScenario7() {
        boolean result = solution.isValid("){");
        Assertions.assertFalse(result);
    }

}
