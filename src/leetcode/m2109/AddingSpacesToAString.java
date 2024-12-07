/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2109;

/**
 * LeetCode 2109
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/03 09:22
 */
public class AddingSpacesToAString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int start = 0;
        while (i < s.length() && start < spaces.length) {
            if (i == spaces[start]) {
                sb.append(" ");
                sb.append(s.charAt(i));
                start++;
            } else {
                sb.append(s.charAt(i));
            }
            i++;
        }
        sb.append(s, i, s.length());
        return sb.toString();
    }
}
