/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 494
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/22 09:55
 */
public class TargetSum_494 {
    public int findTargetSumWays(int[] nums, int target) {
        List<Map<Integer, Integer>> dp = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        map.put(-nums[0], map.getOrDefault(-nums[0], 0) + 1);
        dp.add(map);

        for (int i = 1; i < nums.length; i++) {
            Map<Integer, Integer> prevMap = dp.get(i - 1);
            Map<Integer, Integer> newMap = new HashMap<>();
            int num = nums[i];
            prevMap.forEach((key, value) -> {
                int positiveSum = key + num;
                int negativeSum = key - num;
                newMap.put(positiveSum, newMap.getOrDefault(positiveSum, 0) + value);
                newMap.put(negativeSum, newMap.getOrDefault(negativeSum, 0) + value);
            });
            dp.add(newMap);
        }

        Map<Integer, Integer> stats = dp.get(nums.length - 1);
        return stats.getOrDefault(target, 0);
    }
}
