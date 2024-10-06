/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1433;

import java.util.Arrays;

/**
 * LeetCode 1433
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/13 16:23
 */
public class CheckIfAStringCanBreakAnotherString {
    public boolean checkIfCanBreak(String s1, String s2) {
        int n = s1.length();
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for (int i = 0; i < n; i++) {
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }

        int[] arr1 = Arrays.copyOfRange(s1Arr, 0, s1Arr.length);
        int[] arr2 = Arrays.copyOfRange(s2Arr, 0, s2Arr.length);

        return breakString(arr1, arr2) || breakString(s2Arr, s1Arr);
    }

    private boolean breakString(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int target = arr1[i];
            int j = i;
            while (j < arr2.length && target > 0) {
                int count = arr2[j];
                if (target >= count) {
                    target -= count;
                    arr2[j] = 0;
                    j++;
                } else {
                    arr2[j] -= target;
                    target = 0;
                }
            }
            if (target > 0) {
                return false;
            }
        }
        return true;
    }
}
