/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 852
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/10 10:58
 */
public class PeakIndexInAMountainArray_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isPeak(arr, mid)) {
                return mid;
            }
            if (isIncreasing(arr, mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private boolean isPeak(int[] arr, int idx) {
        if (idx == 0 || idx == arr.length - 1) {
            return false;
        }
        return arr[idx] > arr[idx - 1] && arr[idx] > arr[idx + 1];
    }

    private boolean isIncreasing(int[] arr, int idx) {
        if (idx == 0) {
            return true;
        }
        if (idx == arr.length - 1) {
            return false;
        }
        return arr[idx] > arr[idx - 1] && arr[idx] < arr[idx + 1];
    }
}
