/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode 1386
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/08 11:56
 */
public class CinemaSeatAllocation_1386 {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] reserved : reservedSeats) {
            int row = reserved[0];
            Set<Integer> seats = map.getOrDefault(row, new HashSet<>());
            seats.add(reserved[1]);
            map.put(row, seats);
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += countGroups(map.get(i));
        }
        return res;
    }

    private int countGroups(Set<Integer> reservedSeats) {
        if (reservedSeats == null || reservedSeats.isEmpty()) {
            return 2;
        }
        int groups = 0;
        if (!reservedSeats.contains(2) &&
                !reservedSeats.contains(3) &&
                !reservedSeats.contains(4) &&
                !reservedSeats.contains(5)) {
            groups++;
        }
        if (!reservedSeats.contains(6) &&
                !reservedSeats.contains(7) &&
                !reservedSeats.contains(8) &&
                !reservedSeats.contains(9)) {
            groups++;
        }
        if (groups == 0 &&
                !reservedSeats.contains(4) &&
                !reservedSeats.contains(5) &&
                !reservedSeats.contains(6) &&
                !reservedSeats.contains(7)) {
            groups++;
        }
        return groups;
    }
}
