/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m122;

/**
 * @author taohong on 21/09/2018
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int profit = 0;
        int lowPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > lowPrice) {
                profit += prices[i] - lowPrice;
            }
            lowPrice = prices[i];
        }

        return profit;
    }
}
