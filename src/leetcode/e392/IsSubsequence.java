/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e392;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 392
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/05 13:51
 */
public interface IsSubsequence {
    boolean isSubsequence(String s, String t);

    class Solution1 implements IsSubsequence {
        @Override
        public boolean isSubsequence(String s, String t) {
            int i = 0;
            for (int j = 0; j < t.length() && i < s.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                }
            }
            return i == s.length();
        }
    }

    class Solution2 implements IsSubsequence {
        // 查找左侧边界的二分查找
        private int leftBound(List<Integer> arr, int tar) {
            int lo = 0;
            int hi = arr.size();
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if (tar > arr.get(mid)) {
                    lo = mid + 1;
                } else {
                    hi = mid;
                }
            }
            return lo;
        }

        @Override
        public boolean isSubsequence(String s, String t) {
            List<List<Integer>> indexes = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                indexes.add(new ArrayList<>());
            }
            for (int i = 0; i < t.length(); i++) {
                int letter = t.charAt(i) - 97;
                indexes.get(letter).add(i);
            }

            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                int letter = s.charAt(i) - 97;
                if (indexes.get(letter).isEmpty()) {
                    return false;
                }
                List<Integer> letterIndexes = indexes.get(letter);
                int pos = leftBound(letterIndexes, j);
                if (pos == letterIndexes.size()) {
                    return false;
                }
                j = letterIndexes.get(pos) + 1;
            }
            return true;
        }
    }
}
