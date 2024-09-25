/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;

/**
 * LeetCode 948
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/25 15:56
 */
public class BagOfTokens_948 {
    public int bagOfTokensScore(int[] tokens, int power) {
        if (tokens.length == 0) {
            return 0;
        }

        Arrays.sort(tokens);
        int score = 0;
        int left = 0;
        int right = tokens.length - 1;
        while (left <= right) {
            boolean moved = false;
            while (left <= right && power >= tokens[left]) {
                power -= tokens[left];
                score++;
                left++;
                moved = true;
            }
            while (left < right && power < tokens[left] && score > 0) {
                power += tokens[right];
                score--;
                right--;
                moved = true;
            }
            if (!moved) {
                break;
            }
        }
        return score;
    }
}
