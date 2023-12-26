/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package support;

import leetcode.ListNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/28 17:11
 */
class ListNodeGeneratorTest {

    @Test
    void generateNodesFromOneToFive() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNodeGenerator.getListNode(nums);
        int i = 0;
        while (head != null) {
            assertTrue(i < nums.length);
            assertEquals(head.getVal(), nums[i]);
            head = head.getNext();
            i++;
        }
        assertEquals(i, nums.length);
    }
}