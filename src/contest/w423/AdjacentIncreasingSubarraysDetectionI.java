/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w423;

import java.util.List;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 10:30
 */
public class AdjacentIncreasingSubarraysDetectionI {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int count = 1;
        int prev = nums.get(0);
        boolean isPrevValid = false;
        for (int i = 1; i < nums.size(); i++) {
            int curr = nums.get(i);
            if (curr > prev) {
                prev = curr;
                count++;
            } else {
                if (count >= k * 2) {
                    return true;
                }
                if (count >= k && isPrevValid) {
                    return true;
                }
                isPrevValid = count >= k;
                prev = curr;
                count = 1;
            }
        }

        return count >= k * 2 || isPrevValid && count >= k;
    }
}
