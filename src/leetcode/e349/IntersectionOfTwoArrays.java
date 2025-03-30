/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e349;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 349
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/28 08:32
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] nums = new int[1001];
        for (int num : nums1) {
            nums[num] = 1;
        }
        Set<Integer> res = new HashSet<>();
        for (int num : nums2) {
            if (nums[num] == 1) {
                res.add(num);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
