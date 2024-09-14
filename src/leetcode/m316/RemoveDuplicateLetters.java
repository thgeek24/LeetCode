/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m316;

import java.util.LinkedList;

/**
 * LeetCode 316
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/14 09:15
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        LinkedList<Character> letters = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!letters.contains(letter)) {
                letters.add(letter);
                continue;
            }

            int index = letters.indexOf(letter);
            if (index != letters.size() - 1) {
                Character nextLetter = letters.get(index + 1);
                if (nextLetter < letter) {
                    letters.remove(index);
                    letters.add(letter);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        letters.forEach(sb::append);
        return sb.toString();
    }
}
