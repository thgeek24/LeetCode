/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w424;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 3357
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/19 09:14
 */
public interface MinimizeTheMaximumAdjacentElementDifference {
    int minDifference(int[] nums);

    static List<MinimizeTheMaximumAdjacentElementDifference> getAllSolutions() {
        return Arrays.asList(new Solution1(), new Solution2());
    }

    class Solution1 implements MinimizeTheMaximumAdjacentElementDifference {
        @Override
        public int minDifference(int[] nums) {
            int n = nums.length, max_adj = 0, mina = Integer.MAX_VALUE, maxb = 0;
            for (int i = 0; i < n - 1; ++i) {
                int a = nums[i], b = nums[i + 1];
                if (a > 0 && b > 0) {
                    max_adj = Math.max(max_adj, Math.abs(a - b));
                } else if (a > 0 || b > 0) {
                    mina = Math.min(mina, Math.max(a, b));
                    maxb = Math.max(maxb, Math.max(a, b));
                }
            }

            int res = 0, min_2r = (maxb - mina + 2) / 3 * 2;
            for (int i = 0; i < n; ++i) {
                if ((i > 0 && nums[i - 1] == -1) || nums[i] > 0) continue;
                int j = i;
                while (j < n && nums[j] == -1) {
                    j++;
                }
                int a = Integer.MAX_VALUE, b = 0;
                if (i > 0) {
                    a = Math.min(a, nums[i - 1]);
                    b = Math.max(b, nums[i - 1]);
                }
                if (j < n) {
                    a = Math.min(a, nums[j]);
                    b = Math.max(b, nums[j]);
                }
                if (j - i == 1) {
                    res = Math.max(res, Math.min(maxb - a, b - mina));
                } else {
                    res = Math.max(res, Math.min(maxb - a, Math.min(b - mina, min_2r)));
                }
            }
            return Math.max(max_adj, (res + 1) / 2);
        }
    }

    class Solution2 implements MinimizeTheMaximumAdjacentElementDifference {
        @Override
        public int minDifference(int[] nums) {
            ArrayList<int[]> arr = new ArrayList<>();
            int n = nums.length;
            int last = -1;
            int min = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] != -1) {
                    if (i > 0 && nums[i - 1] != -1) min = Math.max(min, Math.abs(nums[i] - nums[i - 1]));
                    last = i;
                    continue;
                }
                int p = i;
                while (p < n && nums[p] == -1) p++;
                int cnt = p - i;
                if (p == n) {
                    arr.add(new int[]{last, -1, cnt});
                    break;
                } else {
                    arr.add(new int[]{last, p, cnt});
                }
                i = p - 1;
            }
            if (arr.isEmpty()) return min;
            int l = min, r = (int) 1e9;
            while (l < r) {
                int mid = l + (r - l) / 2;
                boolean flag = check(arr, mid, nums);
                if (flag) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            return l;
        }

        boolean check(ArrayList<int[]> arr, int l, int[] nums) {
            int min = Integer.MAX_VALUE;
            int max = 0;
            for (int[] seg : arr) {
                if (seg[0] != -1) {
                    min = Math.min(nums[seg[0]] + l, min);
                    max = Math.max(nums[seg[0]] - l, max);
                }
                if (seg[1] != -1) {
                    min = Math.min(nums[seg[1]] + l, min);
                    max = Math.max(nums[seg[1]] - l, max);
                }
            }
            if (min >= max) return true;
            for (int[] seg : arr) {
                if (seg[0] == -1 || seg[1] == -1) continue;
                int m1 = Math.max(nums[seg[0]], nums[seg[1]]);
                int m2 = Math.min(nums[seg[0]], nums[seg[1]]);
                if ((Math.abs(m1 - min) <= l && Math.abs(m2 - min) <= l) || (Math.abs(m1 - max) <= l && Math.abs(m2 - max) <= l))
                    continue;
                if (Math.abs(max - m1) <= l && Math.abs(min - m2) <= l && Math.abs(min - max) <= l && seg[2] > 1)
                    continue;
                return false;
            }
            return true;
        }
    }
}
