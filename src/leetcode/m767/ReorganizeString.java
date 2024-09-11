/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m767;

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

        int[] res = new int[s.length()];
        while (!queue.isEmpty()) {
            int[] item = queue.poll();
            if (item[1] > 0) {
                int j = 0;
                while (j < res.length && item[1] > 0) {
                    if (res[j] == 0) {
                        if (j == 0) {
                            res[j] = item[0] + 'a';
                            item[1]--;
                        } else if (res[j - 1] != item[0] + 'a') {
                            res[j] = item[0] + 'a';
                            item[1]--;
                        }
                    }
                    j++;
                }
                if (item[1] > 0) {
                    return "";
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int item : res) {
            sb.append((char) item);

        }
        return sb.toString();
    }
}
