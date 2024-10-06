/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * LeetCode 846
 * This is the same as {@link DivideArrayInSetsOfKConsecutiveNumbers_1296}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/03 10:39
 */
public class HandOfStraights_846 {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int item : hand) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > 0) {
                for (int i = 0; i < groupSize; i++) {
                    int currentNum = num + i;
                    if (map.getOrDefault(currentNum, 0) < count) {
                        return false;
                    }
                    map.put(currentNum, map.get(currentNum) - count);
                }
            }
        }
        return true;
    }
}
