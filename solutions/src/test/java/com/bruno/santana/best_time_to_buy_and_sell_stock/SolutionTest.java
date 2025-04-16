package com.bruno.santana.best_time_to_buy_and_sell_stock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testScenario1() {
        Solution solution = new Solution();
        int result = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    void testScenario2() {
        Solution solution = new Solution();
        int result = solution.maxProfit(new int[]{7, 6, 4, 3, 1});

        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void testScenario3() {
        Solution solution = new Solution();
        int result = solution.maxProfit(new int[]{7, 8, 9, 6, 4, 3, 2});

        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void testScenario4() {
        Solution solution = new Solution();
        int result = solution.maxProfit(new int[]{7, 8, 9, 6, 4, 3, 6});

        int expected = 3;
        assertEquals(expected, result);
    }

}
