/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1338;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * LeetCode 1338
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/15 11:39
 */
public class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> count = map.values().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        int half = arr.length / 2;
        int removed = 0;
        for (int i = 0; i < count.size(); i++) {
            removed += count.get(i);
            if (removed >= half) {
                return i + 1;
            }
        }
        return count.size();
    }
}
