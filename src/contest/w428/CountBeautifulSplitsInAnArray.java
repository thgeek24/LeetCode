/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w428;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 3388
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/15 11:18
 */
public class CountBeautifulSplitsInAnArray {
    public int beautifulSplits(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }

        Set<String> set = new HashSet<>();
        for (int left = 0; left < nums.length - 1; left++) {
            int right = left + 1;
            while (right < nums.length) {
                if (isPrefix(nums, left, right)) {
                    if (left == 0) {
                        int midRight = right * 2 - left;
                        while (midRight < nums.length) {
                            set.add(right + "-" + midRight);
                            midRight++;
                        }
                    } else {
                        set.add(left + "-" + right);
                    }
                }
                right++;
            }
        }

        return set.size();
    }

    private boolean isPrefix(int[] nums, int left, int right) {
        if (left < 0 || right > nums.length - 1 || left >= right) {
            return false;
        }
        int i = left;
        int j = right;
        while (j < nums.length && i < right) {
            if (nums[i++] != nums[j++]) {
                return false;
            }
        }
        return i == right;
    }
}
