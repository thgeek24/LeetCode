/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m6;

/**
 * LeetCode 6
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/25 14:20
 */
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        int cols;
        if (numRows == 1) {
            cols = s.length();
        } else {
            int count = (int) Math.ceil((double) s.length() / (numRows * 2 - 2));
            cols = count * (numRows - 1);
        }
        char[][] zigzag = new char[numRows][cols];

        int row = 0;
        int col = 0;
        int i = 0;
        while (i < s.length()) {
            while (row < zigzag.length && i < s.length()) {
                zigzag[row][col] = s.charAt(i);
                row++;
                i++;
            }
            row = Math.max(0, zigzag.length - 2);
            col++;
            while (row > 0 && i < s.length()) {
                zigzag[row][col] = s.charAt(i);
                row--;
                col++;
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char[] rowChars : zigzag) {
            for (char ch : rowChars) {
                if (ch != '\u0000') {
                    sb.append(ch);
                }
            }

        }
        return sb.toString();
    }
}
