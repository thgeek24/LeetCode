/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h68;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 68
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/26 08:07
 */
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> candidates = new ArrayList<>();
        int lineLen = 0;
        for (String word : words) {
            if (word.length() + lineLen > maxWidth) {
                // distribute empty spaces
                StringBuilder sb = new StringBuilder();
                if (candidates.size() == 1) {
                    sb.append(candidates.get(0));
                    while (sb.length() < maxWidth) {
                        sb.append(" ");
                    }
                } else {
                    int totalSpaces = maxWidth - lineLen + candidates.size();
                    int spaces = totalSpaces / (candidates.size() - 1);
                    int remainder = totalSpaces % (candidates.size() - 1);
                    for (int i = 0; i < candidates.size() - 1; i++) {
                        sb.append(candidates.get(i));
                        for (int j = 0; j < spaces; j++) {
                            sb.append(" ");
                        }
                        if (i < remainder) {
                            sb.append(" ");
                        }
                    }
                    sb.append(candidates.get(candidates.size() - 1));
                }

                // add it to res
                res.add(sb.toString());
                // reset
                candidates.clear();
                candidates.add(word);
                lineLen = word.length() + 1;
            } else {
                candidates.add(word);
                lineLen += word.length() + 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.join(" ", candidates));
        while (sb.length() < maxWidth) {
            sb.append(" ");
        }
        res.add(sb.toString());

        return res;
    }
}
