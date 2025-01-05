/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e258;

/**
 * LeetCode 258
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/05 10:43
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 9 == 0 ? 9 : num % 9;
    }
}
