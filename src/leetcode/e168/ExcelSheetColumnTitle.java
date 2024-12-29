/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e168;

/**
 * LeetCode 168
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/14 11:46
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust for 1-based indexing
            int remainder = columnNumber % 26;
            result.append((char) ('A' + remainder));
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}
