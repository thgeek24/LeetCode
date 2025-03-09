/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;

/**
 * LeetCode 455
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/23 10:57
 */
public class AssignCookies_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int res = 0;
        int child = 0;
        int cookie = 0;

        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
                res++;
            }
            cookie++;
        }
        return res;
    }
}
