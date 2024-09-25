/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m238;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 238
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/20 10:31
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        List<Integer> zeroIndexes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else if (zeroIndexes.isEmpty()) {
                zeroIndexes.add(i);
            } else {
                return new int[nums.length];
            }
        }

        int[] res = new int[nums.length];
        if (zeroIndexes.size() == 1) {
            res[zeroIndexes.get(0)] = product;
            return res;
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = product / nums[i];
        }
        return res;
    }
}
