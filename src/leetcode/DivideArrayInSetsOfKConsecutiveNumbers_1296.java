/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * LeetCode 1296
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/03 09:53
 */
public class DivideArrayInSetsOfKConsecutiveNumbers_1296 {
    public boolean isPossibleDivide(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        while (!map.isEmpty()) {
            Map.Entry<Integer, Integer> entry = map.pollFirstEntry();
            int num = entry.getKey();
            int count = entry.getValue();

            int i = num + 1;
            while (i < num + k) {
                if (!map.containsKey(i)) {
                    return false;
                }
                if (map.get(i) < count) {
                    return false;
                }
                if (map.get(i) == count) {
                    map.remove(i);
                    i++;
                    continue;
                }
                map.put(i, map.get(i) - count);
                i++;
            }
        }

        return true;
    }
}
