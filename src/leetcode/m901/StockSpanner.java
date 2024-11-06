/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m901;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 901
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/07 00:29
 */
public class StockSpanner {
    private final List<Integer> prices;

    public StockSpanner() {
        this.prices = new ArrayList<>();
    }

    public int next(int price) {
        if (prices.isEmpty()) {
            prices.add(price);
            return 1;
        }
        if (price >= prices.get(prices.size() - 1)) {
            prices.add(price);
            int count = 0;
            for (int i = prices.size() - 1; i >= 0; i--) {
                if (price >= prices.get(i)) {
                    count++;
                } else {
                    break;
                }
            }
            return count;
        } else {
            prices.add(price);
            return 1;
        }
    }
}