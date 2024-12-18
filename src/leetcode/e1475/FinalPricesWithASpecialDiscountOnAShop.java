/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e1475;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 1475
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/18 08:49
 */
public class FinalPricesWithASpecialDiscountOnAShop {
    public int[] finalPrices(int[] prices) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    res.add(prices[i] - prices[j]);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                res.add(prices[i]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
