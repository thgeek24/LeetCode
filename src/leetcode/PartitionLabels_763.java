/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * LeetCode 763
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/01 10:08
 */
public class PartitionLabels_763 {
    public List<Integer> partitionLabels(String s) {
        Map<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, new int[]{i, i});
                continue;
            }
            int[] arr = map.get(ch);
            arr[1] = i;
        }

        List<int[]> sorted = map.values()
                .stream()
                .sorted(Comparator.comparingInt(o -> o[0]))
                .collect(Collectors.toList());
        List<int[]> intervals = new ArrayList<>();
        intervals.add(sorted.get(0));
        for (int i = 1; i < sorted.size(); i++) {
            int[] previous = intervals.get(intervals.size() - 1);
            int[] current = sorted.get(i);
            if (current[0] < previous[1]) {
                previous[1] = Math.max(previous[1], current[1]);
            } else {
                intervals.add(current);
            }
        }
        return intervals.stream()
                .map(item -> item[1] - item[0] + 1)
                .collect(Collectors.toList());
    }
}
