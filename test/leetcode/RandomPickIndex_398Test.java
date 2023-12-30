/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link RandomPickIndex_398}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/29 11:55
 */
class RandomPickIndex_398Test {
    // Possible indexes for 3: 2,7,8,10,11
    private final int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 3, 2, 3, 3, 4, 5};

    private Set<Integer> indexes;

    private final int total = 10000;

    private RandomPickIndex_398 test;

    @BeforeEach
    public void setUp() {
        test = new RandomPickIndex_398(nums);
        indexes = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                indexes.add(i);
            }
        }
    }

    @Test
    public void validIndexForThree() {
        int i = 0;
        while (i < total) {
            int index = test.pick(3);
            assertTrue(indexes.contains(index));
            i++;
        }
    }

    @Test
    public void indexDistributedUniformly() {
        HashMap<Integer, Integer> stats = new HashMap<>();
        int i = 0;
        while (i < total) {
            int index = test.pick(3);
            Integer indexCount = stats.getOrDefault(index, 0) + 1;
            stats.put(index, indexCount);
            i++;
        }
        indexes.forEach(item ->
                assertTrue(Math.abs(1 - (double) stats.get(item) / total / 0.2) < 0.05));
    }
}