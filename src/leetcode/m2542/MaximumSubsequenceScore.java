/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2542;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * LeetCode 2542
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 11:08
 */
public class MaximumSubsequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];

        // Combine nums1 and nums2 values into pairs and sort by nums2 values in descending order
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }
        Arrays.sort(pairs, (a, b) -> b[1] - a[1]);

        // Min-heap to keep track of the top k elements from nums1
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum = 0;
        long maxScore = 0;

        // Traverse pairs and calculate max score
        for (int i = 0; i < n; i++) {
            int num1 = pairs[i][0];
            int num2 = pairs[i][1];

            // Add the current num1 to the heap and update the sum
            minHeap.add(num1);
            sum += num1;

            // If the heap size exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                sum -= minHeap.poll();
            }

            // When we have exactly k elements, calculate the score
            if (minHeap.size() == k) {
                // 已知 num2 递减，想要 max 增大，num1 需更大
                // 如果新加的 num1 较小而被减出去，num2 留下与 sum 相乘，则因之前已有相同的 sum 与更大的 num2 相乘，所以 max 不会被更新
                // 如果新加的 num1 较大则有可能更新 max，num2 每次都会留下，则更大的 sum 和可能减小的 num2 相乘，取旧 max 与新乘积的最大值
                maxScore = Math.max(maxScore, sum * num2);
            }
        }

        return maxScore;
    }
}
