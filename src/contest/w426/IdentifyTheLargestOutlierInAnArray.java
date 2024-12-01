/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w426;

import java.util.Arrays;

/**
 * Weekly Contest 426
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/01 10:54
 */
public class IdentifyTheLargestOutlierInAnArray {
    public int getLargestOutlier(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int specialSum = sum - nums[i];
            if (specialSum % 2 != 0) {
                continue;
            }
            specialSum /= 2;
            if (hasTarget(nums, i, specialSum)) {
                return nums[i];
            }
        }
        return Integer.MIN_VALUE;
    }

    private boolean hasTarget(int[] nums, int omittedIndex, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (left == omittedIndex) {
                left++;
            } else if (right == omittedIndex) {
                right--;
            }
            if (left > right) {
                return false;
            }

            int mid = left + (right - left) / 2;
            if (nums[mid] == target && mid == omittedIndex) {
                return false;
            } else if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
