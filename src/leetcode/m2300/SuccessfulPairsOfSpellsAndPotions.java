/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2300;

import java.util.Arrays;

/**
 * LeetCode 2300
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 16:30
 */
public class SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // Sort the potions array to allow binary searching
        Arrays.sort(potions);
        int n = potions.length;
        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            // Calculate the minimum potion strength needed for a successful pair
            long requiredPotion = (success + spell - 1) / spell; // Use ceiling division to avoid fractions

            // Binary search to find the first valid potion for this spell
            int left = 0, right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (potions[mid] >= requiredPotion) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // All potions from index `left` to the end of the array are successful pairs
            result[i] = n - left;
        }

        return result;
    }
}
