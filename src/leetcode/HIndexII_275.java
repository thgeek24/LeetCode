/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 275
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/11 10:33
 */
public class HIndexII_275 {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int papers = len - mid;
            if (papers >= citations[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int papers = len - left;
        if (papers >= citations[left]) {
            return papers;
        }
        return Math.min(papers + 1, len);
    }
}
