/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m649;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 649
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 14:36
 */
public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        int rCount = 0;
        int dCount = 0;
        Queue<Character> queue = new LinkedList<>();
        for (char senator : senate.toCharArray()) {
            queue.add(senator);
            if (senator == 'R') {
                rCount++;
            } else {
                dCount++;
            }
        }

        int rBanned = 0;
        int dBanned = 0;
        while (!queue.isEmpty()) {
            char senator = queue.poll();
            if (senator == 'R') {
                if (rBanned > 0) {
                    rBanned--;
                    continue;
                }

                if (rCount > 0) {
                    queue.add(senator);
                    if (dCount > 0) {
                        dCount--;
                        dBanned++;
                    }
                    if (dCount == 0) {
                        return "Radiant";
                    }
                }
                continue;
            }

            if (dBanned > 0) {
                dBanned--;
                continue;
            }
            if (dCount > 0) {
                queue.add(senator);
                if (rCount > 0) {
                    rCount--;
                    rBanned++;
                }
                if (rCount == 0) {
                    return "Dire";
                }
            }
        }

        return null;
    }
}
