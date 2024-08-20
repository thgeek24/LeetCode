/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;

/**
 * LeetCode 135
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/20 09:08
 */
public class Candy_135 {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        for (int i = 0; i < ratings.length; ) {
            int nearestPit = findNextPit(i, ratings);
            // Distribute candies to positions before the pit
            for (int j = nearestPit - 1; j >= i; j--) {
                if (ratings[j] == ratings[j + 1]) {
                    candies[j] = candies[j + 1];
                } else {
                    candies[j] = candies[j + 1] + 1;
                }
            }
            // Distribute candies to the position one after the pit
            if (nearestPit != ratings.length - 1) {
                candies[nearestPit + 1] = candies[nearestPit] + 1;
            }

            if (i == nearestPit) {
                i++;
            } else {
                i = nearestPit + 1;
            }
        }
        return Arrays.stream(candies).sum();
    }

    private int findNextPit(int index, int[] ratings) {
        // pit is defined as the position
        // that will decide the candies on previous non-pit positions
        if (ratings.length == 1) {
            return 0;
        }

        if (index == 0) {
            if (ratings[0] < ratings[1]) {
                return 0;
            }
            return findNextPit(1, ratings);
        }

        while (index < ratings.length - 1) {
            if (ratings[index] < ratings[index - 1] && ratings[index] < ratings[index + 1]) {
                return index;
            }
            index++;
        }

        return ratings.length - 1;
    }
}
