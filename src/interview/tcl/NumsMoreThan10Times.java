/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package interview.tcl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/30 10:36
 */
public class NumsMoreThan10Times {
    public List<Integer> count(List<Set<Integer>> lists) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Set<Integer> set : lists) {
            set.forEach(item -> map.put(item, map.getOrDefault(item, 0) + 1));
        }
        List<Integer> res = new ArrayList<>();
        map.forEach((k, v) -> {
            if (v > 10) {
                res.add(k);
            }
        });
        return res;

    }
}
