/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 2300
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 16:30
 */
public class SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < spells.length; i++) {
            List<Integer> indexes = map.getOrDefault(spells[i], new ArrayList<>());
            indexes.add(i);
            map.put(spells[i], indexes);
        }

        Arrays.sort(spells);
        Arrays.sort(potions);
        int[] res = new int[spells.length];
        int spellIndex = 0;
        while (spellIndex < spells.length) {
            int spell = spells[spellIndex];
            if (map.containsKey(spell)) {
                int potionIndex = 0;
                while (potionIndex < potions.length) {
                    long product = (long) spell * potions[potionIndex];
                    if (product >= success) {
                        List<Integer> indexes = map.get(spell);
                        int successCount = potions.length - potionIndex;
                        for (Integer index : indexes) {
                            res[index] = successCount;
                        }
                        map.remove(spell);
                        break;
                    }
                    potionIndex++;
                }
            }
            spellIndex++;
        }
        return res;
    }
}
