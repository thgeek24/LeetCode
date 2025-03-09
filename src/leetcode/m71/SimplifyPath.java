/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m71;

/**
 * LeetCode 71
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/29 11:15
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        for (String item : paths) {
            if (item.isEmpty() || item.equals(".")) {
                continue;
            } else if (item.equals("..")) {
                int start = sb.lastIndexOf("/", Math.max(0, sb.length() - 2));
                int end = sb.length();
                sb.delete(start, end);
            } else {
                sb.append(item);
            }
            sb.append("/");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
