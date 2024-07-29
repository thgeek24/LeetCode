/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode 997
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/29 10:22
 */
public class FindTheTownJudge_997 {
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Set<Integer>> judges = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            judges.put(i, new HashSet<>());
        }
        for (int[] item : trust) {
            int person = item[0];
            int trustedPerson = item[1];
            judges.remove(person);
            if (judges.containsKey(trustedPerson)) {
                judges.get(trustedPerson).add(person);
            }
        }

        if (judges.size() != 1) {
            return -1;
        }
        Map.Entry<Integer, Set<Integer>> judgeEntry = judges.entrySet()
                .stream()
                .findFirst()
                .get();
        if (judgeEntry.getValue().size() != n - 1) {
            return -1;
        }
        return judgeEntry.getKey();
    }
}
