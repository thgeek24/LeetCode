/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * LeetCode 1053
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/28 14:10
 */
public class PreviousPermutationWithOneSwap_1053 {
    public int[] prevPermOpt1(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        int min = arr[arr.length - 1];
        map.put(min, arr.length - 1);
        int pos = arr.length - 2;
        while (pos >= 0) {
            if (arr[pos] > min) {
                break;
            } else {
                min = Math.min(min, arr[pos]);
                map.put(arr[pos], pos);
            }
            pos--;
        }
        if (pos == -1) {
            return arr;
        }

        while (!map.isEmpty()) {
            Map.Entry<Integer, Integer> entry = map.pollFirstEntry();
            int num = entry.getKey();
            int index = entry.getValue();
            if (arr[pos] > num) {
                int tmp = arr[pos];
                arr[pos] = num;
                arr[index] = tmp;
                return arr;
            }
        }
        return arr;
    }
}
