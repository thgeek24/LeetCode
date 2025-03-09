/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2554;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * LeetCode 2554
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/06 08:38
 */
public class MaximumNumberOfIntegersToChooseFromARangeI {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = Arrays.stream(banned).boxed().collect(Collectors.toSet());
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            }
            if (sum + i <= maxSum) {
                sum += i;
                res.add(i);
            } else {
                break;
            }
        }
        return res.size();
    }
}
