/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * LeetCode 1276
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/26 10:32
 */
public class NumberOfBurgersWithNoWasteOfIngredients_1276 {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (tomatoSlices < cheeseSlices * 2
                || tomatoSlices > cheeseSlices * 4) {
            return Collections.emptyList();
        }

        int extraJumboSlices = tomatoSlices - cheeseSlices * 2;
        if (extraJumboSlices % 2 != 0) {
            return Collections.emptyList();
        }
        int jumbos = extraJumboSlices / 2;
        int smalls = cheeseSlices - jumbos;
        return Arrays.asList(jumbos, smalls);
    }
}
