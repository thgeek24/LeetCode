/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m767;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * LeetCode 767
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/11 10:14
 */
public class ReorganizeString {
    public String reorganizeString(String s) {
        int[][] letters = new int[26][1];
        for (char c : s.toCharArray()) {
            letters[c - 'a'][0]++;
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        for (int i = 0; i < letters.length; i++) {
            if (letters[i][0] != 0) {
                queue.offer(new int[]{i, letters[i][0]});
            }
        }

        List<Character> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            int[] first = queue.poll();
            int[] second = !queue.isEmpty() ? queue.poll() : null;

            int firstChar = first[0] + 'a';
            if (!ans.isEmpty() && firstChar == ans.get(ans.size() - 1)) {
                return "";
            }
            ans.add((char) firstChar);
            first[1]--;
            if (first[1] > 0) {
                queue.offer(first);
            }

            if (second != null) {
                ans.add((char) (second[0] + 'a'));
                second[1]--;
                if (second[1] > 0) {
                    queue.offer(second);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character an : ans) {
            sb.append(an);
        }
        return sb.toString();
    }
}
