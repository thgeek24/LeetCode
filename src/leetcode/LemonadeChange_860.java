/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 860
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/30 12:07
 */
public class LemonadeChange_860 {
    public boolean lemonadeChange(int[] bills) {
        int[] notes = new int[2];
        for (int pay : bills) {
            // pay with 5
            if (pay == 5) {
                notes[0]++;
                continue;
            }
            // pay with  10
            if (pay == 10) {
                if (notes[0] == 0) {
                    return false;
                }
                notes[0]--;
                notes[1]++;
                continue;
            }
            // pay with 20
            if (notes[1] >= 1) {
                if (notes[0] == 0) {
                    return false;
                }
                notes[1]--;
                notes[0]--;
                continue;
            }
            if (notes[0] >= 3) {
                notes[0] -= 3;
                continue;
            }

            // cannot provide correct change
            return false;
        }
        return true;
    }
}
