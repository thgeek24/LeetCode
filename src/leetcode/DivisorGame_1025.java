/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 1025
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/09 11:08
 */
public class DivisorGame_1025 {
    public boolean divisorGame(int n) {
        boolean[] firstPickWin = new boolean[n + 1];
        int i = 2;
        while (i <= n) {
            // TODO Inline findDivisors to exit early on !firstPickWin[i-divisor] == true
            List<Integer> divisors = findDivisors(i);
            boolean canWin = false;
            for (Integer divisor : divisors) {
                if (divisor == i) {
                    continue;
                }
                if (!firstPickWin[i - divisor]) {
                    canWin = true;
                    break;
                }
            }
            firstPickWin[i] = canWin;
            i++;
        }
        return firstPickWin[n];
    }

    private List<Integer> findDivisors(int num) {
        List<Integer> res = new ArrayList<>();
        int sqrt = (int) Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                res.add(i);
                res.add(num / i);
            }
        }
        return res;
    }
}
