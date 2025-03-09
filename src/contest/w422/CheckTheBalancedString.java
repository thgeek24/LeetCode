/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w422;

/**
 * LeetCode 3340
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/03 10:31
 */
public class CheckTheBalancedString {
    public boolean isBalanced(String num) {
        int even = 0;
        int odd = 0;
        char[] charArray = num.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                even += charArray[i] - '0';
            } else {
                odd += charArray[i] - '0';
            }
        }
        return even == odd;
    }
}
