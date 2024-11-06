/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2336;

import java.util.TreeSet;

/**
 * LeetCode 2336
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 10:29
 */
public class SmallestInfiniteSet {
    private int smallest;
    private final TreeSet<Integer> added;

    public SmallestInfiniteSet() {
        this.smallest = 1;
        this.added = new TreeSet<>();
    }

    public int popSmallest() {
        if (added.isEmpty()) {
            return smallest++;
        }
        int minAdded = added.first();
        if (smallest < minAdded) {
            return smallest++;
        } else if (smallest > minAdded) {
            added.pollFirst();
            return minAdded;
        } else {
            added.pollFirst();
            return smallest++;
        }
    }

    public void addBack(int num) {
        added.add(num);
    }
}
