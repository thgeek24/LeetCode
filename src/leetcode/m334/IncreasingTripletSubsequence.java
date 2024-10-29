/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m334;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * LeetCode 334
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/29 23:02
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        TreeMap<Integer, Integer> left = new TreeMap<>(Comparator.naturalOrder());
        TreeMap<Integer, Integer> right = new TreeMap<>(Comparator.reverseOrder());
        left.put(nums[0], 1);
        for (int i = 2; i < nums.length; i++) {
            right.put(nums[i], right.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (left.firstKey() < nums[i] && right.firstKey() > nums[i]) {
                return true;
            }
            left.put(nums[i], left.getOrDefault(nums[i], 0) + 1);
            Integer count = right.get(nums[i + 1]);
            if (count <= 1) {
                right.remove(nums[i + 1]);
            } else {
                right.put(nums[i + 1], count - 1);
            }
        }
        return false;
    }
}
