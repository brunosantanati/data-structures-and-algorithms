package com.bruno.santana.best_time_to_buy_and_sell_stock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// My solution: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1608204159/

public class Solution {

    public int maxProfit(int[] prices) {
        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - minimumPrice;
            maximumProfit = Math.max(profit, maximumProfit);
            minimumPrice = Math.min(prices[i], minimumPrice);
        }

        return maximumProfit;
    }

}
