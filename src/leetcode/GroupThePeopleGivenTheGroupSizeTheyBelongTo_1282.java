/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 1282
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/06 15:58
 */
public class GroupThePeopleGivenTheGroupSizeTheyBelongTo_1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> group = map.getOrDefault(groupSizes[i], new ArrayList<>());
            group.add(i);
            map.put(groupSizes[i], group);

            if (group.size() == groupSizes[i]) {
                res.add(group);
                map.remove(groupSizes[i]);
            }
        }
        return res;
    }
}
