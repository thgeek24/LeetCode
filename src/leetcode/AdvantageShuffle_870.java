/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LeetCode 870
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/10 08:21
 */
public class AdvantageShuffle_870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        List<Integer> nums = Arrays.stream(nums1).sorted().boxed().collect(Collectors.toList());
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            int index = findIndexOfGreaterNum(nums, nums2[i]);
            res[i] = nums.get(index);
            nums.remove(index);
        }
        return res;
    }

    private int findIndexOfGreaterNum(List<Integer> nums, int num) {
        int left = 0;
        int right = nums.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums.get(mid) <= num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left == nums.size() ? 0 : left;
    }
}
