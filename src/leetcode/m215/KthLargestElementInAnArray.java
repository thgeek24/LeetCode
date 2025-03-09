/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m215;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * LeetCode 215
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/23 08:31
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            queue.offer(num);
        }
        int i = 1;
        while (i < k && !queue.isEmpty()) {
            queue.poll();
            i++;
        }
        return queue.poll();
    }
}
