/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m12;

/**
 * LeetCode 12
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/22 09:03
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int remainder = num;
        for (int i = 1000; i > 0; i /= 10) {
            appendRoman(remainder, i, sb);
            remainder %= i;
        }

        return sb.toString();
    }

    private void appendRoman(int num, int decimal, StringBuilder sb) {
        int quotient = num / decimal;
        String higher = getHigherDigit(decimal);
        String half = getHalfDigit(decimal);
        String basic = getBasicDigit(decimal);
        if (quotient == 9) {
            sb.append(basic);
            sb.append(higher);
        } else if (quotient == 4) {
            sb.append(basic);
            sb.append(half);
        } else {
            if (quotient >= 5) {
                sb.append(half);
                quotient -= 5;
            }
            while (quotient > 0) {
                sb.append(basic);
                quotient--;
            }
        }
    }

    private String getHigherDigit(int decimal) {
        switch (decimal) {
            case 1:
                return "X";
            case 10:
                return "C";
            case 100:
                return "M";
            default:
                return "";
        }
    }

    private String getHalfDigit(int decimal) {
        switch (decimal) {
            case 1:
                return "V";
            case 10:
                return "L";
            case 100:
                return "D";
            default:
                return "";
        }
    }

    private String getBasicDigit(int decimal) {
        switch (decimal) {
            case 1:
                return "I";
            case 10:
                return "X";
            case 100:
                return "C";
            case 1000:
                return "M";
            default:
                return "";
        }
    }
}
