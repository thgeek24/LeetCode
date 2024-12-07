/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m216;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * LeetCode 216
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 18:31
 */
public class CombinationSumIII {
    private List<List<Integer>> res;
    private int k;
    private int n;

    public List<List<Integer>> combinationSum3(int k, int n) {
        if (k > n) {
            return Collections.emptyList();
        }
        init(k, n);
        backtrack(1, 0, new ArrayList<>());
        return res;
    }

    private void init(int k, int n) {
        this.res = new ArrayList<>();
        this.k = k;
        this.n = n;
    }

    private void backtrack(int num, int sum, List<Integer> candidate) {
        // 每一次进入 backtrack 方法，一是要进入下一层循环（即再调用一次 backtrack）
        // 二是要继续本层循环
        for (int i = num; i <= 9; i++) {
            candidate.add(i);
            sum += i;
            if (candidate.size() == k && sum == n) {
                res.add(new ArrayList<>(candidate));
                candidate.remove(candidate.size() - 1);
                break;
            }
            // 终止本层循环
            if (sum >= n) {
                candidate.remove(candidate.size() - 1);
                break;
            }
            // 进入下一个数的循环
            if (candidate.size() < k) {
                backtrack(i + 1, sum, candidate);
            }
            // 继续本层循环
            candidate.remove(candidate.size() - 1);
            sum -= i;
        }
    }
}
