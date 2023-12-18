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
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
