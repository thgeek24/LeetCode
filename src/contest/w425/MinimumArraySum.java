/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w425;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * LeetCode 3368
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/24 11:28
 */
public class MinimumArraySum {
    public int minArraySum(int[] nums, int k, int op1, int op2) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            queue.offer(num);
        }
        int sum = 0;
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (op1 > 0 && op2 > 0) {
                int num1 = (int) Math.round((double) num / 2);
                int num2 = num - k;
                sum += Math.min(num1, num2);
                if (num1 < num2) {
                    op1--;
                } else if (num1 > num2) {
                    op2--;
                }
            } else if (op1 > 0) {
                int num1 = (int) Math.ceil((double) num / 2);
                sum += num1;
                op1--;
            } else if (op2 > 0) {
                int num2 = num - k;
                sum += num2;
                op2--;
            } else {
                break;
            }
        }
        return sum;
    }
}
