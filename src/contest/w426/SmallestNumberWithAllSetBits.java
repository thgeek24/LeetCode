/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w426;

/**
 * Weekly Contest 426
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/01 10:31
 */
public class SmallestNumberWithAllSetBits {
    public int smallestNumber(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n >>= 1;
        }
        int num = 1;
        while (count > 0) {
            num <<= 1;
            count--;
        }
        return num - 1;
    }
}
