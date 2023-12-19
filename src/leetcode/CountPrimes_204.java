/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 204
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/19 14:11
 */
public class CountPrimes_204 {
    public int countPrimes(int n) {
        int sqrt = (int) Math.sqrt(n);
        int candidate = 2;
        boolean[] crossedOut = new boolean[n + 1];
        while (candidate <= sqrt) {
            if (crossedOut[candidate]) {
                candidate++;
                continue;
            }
            for (int i = candidate * candidate; i < n; i += candidate) {
                crossedOut[i] = true;
            }
            candidate++;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!crossedOut[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountPrimes_204 counter = new CountPrimes_204();
        int res = counter.countPrimes(10000);
        System.out.println(res);
    }
}
