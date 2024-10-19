/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * LeetCode 39
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/19 10:30
 */
public class CombinationSum {
    private int target;
    private int[] sorted;
    private List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        init(candidates, target);
        backtrack(0, 0, new ArrayList<>());
        return res;
    }

    private void init(int[] candidates, int target) {
        this.sorted = Arrays.stream(candidates)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(item -> item)
                .toArray();
        this.target = target;
        this.res = new ArrayList<>();
    }

    private void backtrack(int index, int sum, List<Integer> list) {
        if (index == sorted.length) {
            return;
        }

        for (int i = index; i < sorted.length; i++) {
            sum += sorted[i];
            if (sum == target) {
                list.add(sorted[i]);
                res.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            } else if (sum < target) {
                list.add(sorted[i]);
                backtrack(i, sum, list);
                list.remove(list.size() - 1);
            }
            sum -= sorted[i];
        }
    }
}
