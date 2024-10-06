/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m274;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LeetCode 274
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/18 09:03
 */
public class HIndex {
    public int hIndex(int[] citations) {
        List<Integer> sorted = Arrays.stream(citations)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        int res = 0;
        for (int i = 0; i < sorted.size(); i++) {
            if (sorted.get(i) >= i + 1) {
                res = i + 1;
            } else {
                break;
            }
        }
        return res;
    }
}
