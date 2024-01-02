/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * LeetCode 855
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/02 15:38
 */
public class ExamRoom_3_855 {
    private final Map<Integer, int[]> startMap;
    private final Map<Integer, int[]> endMap;
    private final TreeSet<int[]> lineSegments;
    private final int capacity;

    public ExamRoom_3_855(int n) {
        this.capacity = n;
        startMap = new HashMap<>();
        endMap = new HashMap<>();
        lineSegments = new TreeSet<>((o1, o2) -> {
            int dist1 = distance(o1);
            int dist2 = distance(o2);
            if (dist1 == dist2) return o1[0] - o2[0];
            return dist2 - dist1;
        });
        addLineSeg(new int[]{-1, capacity});
    }

    public int seat() {
        int[] longest = lineSegments.first();
        int x = longest[0];
        int y = longest[1];

        int seat;
        if (longest[0] == -1) {
            seat = 0;
        } else if (longest[1] == capacity) {
            seat = capacity - 1;
        } else {
            seat = (x + y) / 2;
        }

        int[] left = {x, seat};
        int[] right = {seat, y};
        removeLineSeg(longest);
        addLineSeg(left);
        addLineSeg(right);
        return seat;
    }

    public void leave(int p) {
        int[] right = startMap.get(p);
        int[] left = endMap.get(p);
        int[] merged = new int[]{left[0], right[1]};

        removeLineSeg(right);
        removeLineSeg(left);
        addLineSeg(merged);
    }

    private void addLineSeg(int[] lineSeg) {
        lineSegments.add(lineSeg);
        startMap.put(lineSeg[0], lineSeg);
        endMap.put(lineSeg[1], lineSeg);
    }

    private void removeLineSeg(int[] lineSeg) {
        lineSegments.remove(lineSeg);
        startMap.remove(lineSeg[0]);
        endMap.remove(lineSeg[1]);
    }

    private int distance(int[] lineSeg) {
        int x = lineSeg[0];
        int y = lineSeg[1];
        if (x == -1) return y;
        if (y == capacity) return capacity - 1 - x;
        // 中点和端点之间的长度
        return (y - x) / 2;
    }
}
