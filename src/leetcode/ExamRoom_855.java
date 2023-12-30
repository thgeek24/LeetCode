/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.*;

/**
 * LeetCode 855
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/30 11:00
 */
public class ExamRoom_855 {
    private final TreeSet<Integer> seated;

    private final int capacity;

    public ExamRoom_855(int n) {
        assert n > 0;
        this.capacity = n;
        seated = new TreeSet<>();
    }

    public int seat() {
        if (seated.size() == capacity) {
            return -1;
        }
        if (seated.isEmpty()) {
            seated.add(0);
            return 0;
        }
        Iterator<Integer> iterator = seated.iterator();
        Integer prev = iterator.next();
        OccupiedSeat candidate = null;
        if (!seated.contains(0)) {
            candidate = new OccupiedSeat(0, prev);
        }
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            int seatNum = (prev + next) / 2;
            int maxDist = seatNum - prev;

            if (candidate == null) {
                candidate = new OccupiedSeat(seatNum, maxDist);
                prev = next;
            } else if (maxDist > candidate.getMaxDist()) {
                candidate = new OccupiedSeat(seatNum, maxDist);
            }
            prev = next;
        }
        int lastSeat = capacity - 1;
        if (!seated.contains(lastSeat)) {
            int maxDist = lastSeat - prev;
            if (candidate == null) {
                candidate = new OccupiedSeat(lastSeat, maxDist);
            } else if (maxDist > candidate.getMaxDist()) {
                candidate = new OccupiedSeat(lastSeat, maxDist);
            }
        }
        int res = candidate.getSeatNum();
        seated.add(res);
        return res;
    }

    public void leave(int p) {
        seated.remove(p);
    }

    private static class OccupiedSeat {
        public OccupiedSeat(int seatNum, int maxDist) {
            this.seatNum = seatNum;
            this.maxDist = maxDist;
        }

        private int seatNum;

        private int maxDist;

        public int getSeatNum() {
            return seatNum;
        }

        public void setSeatNum(int seatNum) {
            this.seatNum = seatNum;
        }

        public int getMaxDist() {
            return maxDist;
        }

        public void setMaxDist(int maxDist) {
            this.maxDist = maxDist;
        }
    }
}
