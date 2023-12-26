/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeGenerator;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link LinkedListRandomNode_382}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/28 16:45
 */
class LinkedListRandomNode_382Test {
    private LinkedListRandomNode_382 randomNode;

    @BeforeEach
    public void init() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNodeGenerator.getListNode(nums);
        randomNode = new LinkedListRandomNode_382(head);
    }

    @Test
    void getRandom() {
        Map<Integer, Integer> stats = new HashMap<>();

        int i = 0;
        int total = 10000;
        while (i < total) {
            int random = randomNode.getRandom();
            Integer randomCount = stats.getOrDefault(random, 0) + 1;
            stats.put(random, randomCount);
            i++;
        }

        assertEquals(5, stats.size());
        Integer sum = stats.values().stream().mapToInt(item -> item).sum();
        assertEquals(total, sum);
        assertTrue(Math.abs(1 - (double) stats.get(1) / total / 0.2) < 0.05);
        assertTrue(Math.abs(1 - (double) stats.get(2) / total / 0.2) < 0.05);
        assertTrue(Math.abs(1 - (double) stats.get(3) / total / 0.2) < 0.05);
        assertTrue(Math.abs(1 - (double) stats.get(4) / total / 0.2) < 0.05);
        assertTrue(Math.abs(1 - (double) stats.get(5) / total / 0.2) < 0.05);
    }
}