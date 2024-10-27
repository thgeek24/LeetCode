/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * LeetCode 295
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/27 11:06
 */
public class MedianFinder {
    private final PriorityQueue<Integer> left;  // Max-heap
    private final PriorityQueue<Integer> right; // Min-heap

    public MedianFinder() {
        left = new PriorityQueue<>(Comparator.reverseOrder()); // Max-heap
        right = new PriorityQueue<>(); // Min-heap
    }

    public void addNum(int num) {
        // Step 1: Add number to one of the heaps
        if (left.isEmpty() || num <= left.peek()) {
            left.offer(num);
        } else {
            right.offer(num);
        }

        // Step 2: Balance the heaps
        if (left.size() > right.size() + 1) {
            right.offer(left.poll());
        } else if (right.size() > left.size()) {
            left.offer(right.poll());
        }
    }

    public double findMedian() {
        if (left.size() > right.size()) {
            return left.peek();
        }
        return (left.peek() + right.peek()) / 2.0;
    }
}
