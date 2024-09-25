/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 4
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/17 09:02
 */
public class MedianOfTwoSortedArrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int iMin = 0;
        int iMax = m;
        int halfLen = (m + n + 1) / 2;
        double maxLeft;
        double minRight;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;

            if (i < m && nums2[j - 1] > nums1[i]) {
                iMin = i + 1;
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                iMax = i - 1;
            } else {
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }

                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}

