/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e121;

/**
 * LeetCode 121
 *
 * @author taohong on 05/09/2018
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
