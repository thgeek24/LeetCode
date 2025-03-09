/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m373;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * LeetCode 373
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/26 09:47
 */
public class FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return result;
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(a -> a[0] + a[1])
        );

        // Initialize the heap with the first element of nums1 and all elements of nums2
        for (int j = 0; j < Math.min(nums2.length, k); j++) {
            minHeap.offer(new int[]{nums1[0], nums2[j], 0}); // {num1, num2, index in nums1}
        }

        // Extract the pairs with the smallest sums
        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            result.add(Arrays.asList(curr[0], curr[1]));
            int i = curr[2];

            // If there's a next element in nums1, add the new pair to the heap
            if (i + 1 < nums1.length) {
                minHeap.offer(new int[]{nums1[i + 1], curr[1], i + 1});
            }
        }

        return result;
    }
}
