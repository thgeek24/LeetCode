/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w427;

import java.util.ArrayList;
import java.util.List;

/**
 * Weekly Contest 427
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/08 10:32
 */
public class TransformedArray {
    public int[] constructTransformedArray(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res.add(0);
            } else if (nums[i] > 0) {
                int idx = (i + nums[i]) % nums.length;
                res.add(nums[idx]);
            } else {
                int idx = (i + nums[i]) % nums.length;
                if (idx < 0) {
                    idx = idx + nums.length;
                }
                res.add(nums[idx]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
