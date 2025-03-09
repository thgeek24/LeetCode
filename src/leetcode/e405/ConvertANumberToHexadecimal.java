/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e405;

/**
 * LeetCode 405
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/23 13:20
 */
public class ConvertANumberToHexadecimal {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        while (num != 0 && sb.length() <= 8) {
            int hex = num & 0xf;
            sb.append(hexChars[hex]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
