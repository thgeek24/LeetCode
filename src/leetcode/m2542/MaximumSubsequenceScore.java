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
                maxScore = Math.max(maxScore, sum * num2);
            }
        }

        return maxScore;
    }
}
