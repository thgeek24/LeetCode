/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * LeetCode 119
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/09 15:40
 */
public class PascalsTriangleII_119 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }
        if (rowIndex == 1) {
            return Arrays.asList(1, 1);
        }
        List<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(1);
        for (int i = 2; i <= rowIndex; i++) {
            int temp = res.get(0);
            for (int j = 0; j < i - 1; j++) {
                int left = temp;
                int right = res.get(j + 1);
                res.set(j + 1, left + right);
                temp = right;
            }
            res.add(1);
        }
        return res;
    }
}
