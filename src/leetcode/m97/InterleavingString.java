/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m97;

import java.util.Objects;

/**
 * LeetCode 97
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/28 12:53
 */
public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        if (s1.isEmpty() || s2.isEmpty()) {
            return Objects.equals(s1, s3) || Objects.equals(s2, s3);
        }

        int i = 0;
        int j = 0;
        int t = 0;
        while (i < s1.length() && j < s2.length()) {
            boolean moved = false;
            while (i < s1.length() && s1.charAt(i) == s3.charAt(t)) {
                i++;
                t++;
                moved = true;
            }
            while (j < s2.length() && s2.charAt(j) == s3.charAt(t)) {
                j++;
                t++;
                moved = true;
            }
            if (!moved) {
                return false;
            }
        }

        return true;
    }
}
