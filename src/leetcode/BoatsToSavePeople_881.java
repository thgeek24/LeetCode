/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;

/**
 * LeetCode 881
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/24 09:16
 */
public class BoatsToSavePeople_881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            if (people[left] + people[right] > limit) {
                res++;
                right--;
            } else {
                res++;
                left++;
                right--;
            }
        }
        return res;
    }
}
