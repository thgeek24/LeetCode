/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w424;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 3354
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/17 10:31
 */
public class MakeArrayElementsEqualToZero {
    public int countValidSelections(int[] nums) {
        int sum = 0;
        List<Integer> zeros = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros.add(i);
            }
            sum += nums[i];
        }

        int res = 0;
        int start = 0;
        int leftSum = 0;
        int rightSum = sum;
        for (int zeroIndex : zeros) {
            while (start < zeroIndex) {
                leftSum += nums[start];
                rightSum -= nums[start];
                start++;
            }
            if (leftSum == rightSum) {
                res += 2;
            } else if (Math.abs(leftSum - rightSum) == 1) {
                res++;
            }
        }

        return res;
    }
}
