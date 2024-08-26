/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 219
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/26 15:56
 */
public class ContainsDuplicateII_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, i);
                continue;
            }

            int index = map.get(num);
            if (i - index <= k) {
                return true;
            } else {
                map.put(num, i);
            }
        }
        return false;
    }
}
