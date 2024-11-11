/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w423;

import java.util.List;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 11:02
 */
public class AdjacentIncreasingSubarraysDetectionII {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int max = 0;
        int prevArrLen = 0;
        int currArrLen = 1;
        int prev = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int curr = nums.get(i);
            if (curr > prev) {
                prev = curr;
                currArrLen++;
            } else {
                int minLen;
                if (prevArrLen == 0) {
                    minLen = currArrLen / 2;
                } else if (prevArrLen >= currArrLen) {
                    minLen = currArrLen;
                } else {
                    minLen = Math.max(prevArrLen, currArrLen / 2);
                }
                max = Math.max(max, minLen);
                prevArrLen = currArrLen;
                prev = curr;
                currArrLen = 1;
            }
        }
        int minLen;
        if (prevArrLen == 0) {
            minLen = currArrLen / 2;
        } else if (prevArrLen >= currArrLen) {
            minLen = currArrLen;
        } else {
            minLen = Math.max(prevArrLen, currArrLen / 2);
        }
        return Math.max(max, minLen);
    }
}
