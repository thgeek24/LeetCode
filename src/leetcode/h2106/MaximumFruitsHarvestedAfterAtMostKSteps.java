/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h2106;

/**
 * LeetCode 2106
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/16 11:28
 */
public class MaximumFruitsHarvestedAfterAtMostKSteps {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int len = 200001;
        int[] fruitArr = new int[len];
        for (int[] fruit : fruits) {
            fruitArr[fruit[0]] = fruit[1];
        }

        int sum = 0;
        int left = Math.max(0, startPos - k);
        int right = startPos;
        for (int i = left; i <= right; i++) {
            sum += fruitArr[i];
        }
        int max = sum;

        while (left <= startPos) {
            int leftSteps = startPos - left;
            int remainingSteps = k - leftSteps;
            int newRight = Math.max(remainingSteps / 2 + startPos, remainingSteps - leftSteps + startPos);
            if (newRight >= len) {
                break;
            }
            if (newRight == right) {
                left++;
                continue;
            }
            if (left > 0) {
                sum -= fruitArr[left - 1];
            }
            for (int j = right + 1; j <= newRight; j++) {
                sum += fruitArr[j];
            }
            max = Math.max(max, sum);
            left++;
            right = newRight;
        }

        return max;
    }
}
