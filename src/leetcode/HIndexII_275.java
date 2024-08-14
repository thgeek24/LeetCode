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
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int papers = len - mid;
            if (citations[mid] == papers) { // h-index found
                return papers;
            } else if (citations[mid] < papers) {
                left = mid + 1; // move right to find a larger h-index
            } else {
                right = mid - 1; // move left to find the correct h-index
            }
        }
        return len - left; // Adjusted h-index after exiting loop
    }
}
