/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.PriorityQueue;

/**
 * LeetCode 295
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/27 11:06
 */
public class MedianFinder {
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        this.minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        minHeap.add(num);
    }

    public double findMedian() {
        int size = minHeap.size();
        PriorityQueue<Integer> minHeap_ = new PriorityQueue<>(minHeap);

        if (size % 2 == 1) {
            int mid = size / 2;
            int i = 0;
            while (i < mid) {
                minHeap.poll();
                i++;
            }
            double res = minHeap.peek();
            minHeap = minHeap_;
            return res;
        } else {
            int leftMid = size / 2 - 1;
            int i = 0;
            while (i < leftMid) {
                minHeap.poll();
                i++;
            }
            int leftMidVal = minHeap.poll();
            int rightMidVal = minHeap.poll();
            double res = (double) (leftMidVal + rightMidVal) / 2;
            minHeap = minHeap_;
            return res;
        }
    }
}
