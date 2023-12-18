/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 58
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/17 23:18
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        boolean isPrevLetter = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122
                    || s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                count = isPrevLetter ? count + 1 : 1;
                isPrevLetter = true;
            } else {
                isPrevLetter = false;
            }
        }
        return count;
    }
}