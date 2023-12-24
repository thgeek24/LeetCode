/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 448
 * (try to do it without extra space and in O(n) runtime)
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/23 16:40
 */
public class FindAllNumbersDisappearedInAnArray_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int candidate = nums[i];
            while (candidate != 0) {
                int temp = nums[candidate - 1];
                nums[candidate - 1] = 0;
                candidate = temp;
            }
            i++;
        }
        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                res.add(j + 1);
            }
        }
        return res;
    }
}