/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e141;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link LinkedListCycle}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/16 08:22
 */
class LinkedListCycleTest {
    private LinkedListCycle test;

    @BeforeEach
    void setUp() {
        test = new LinkedListCycle();
    }

    @Test
    void test1() {
        int[] nodes = {3, 2, 0, -4};
        ListNode head = ListNodeGenerator.getListNode(nodes);
        int pos = 1;
        assertTrue(test.hasCycle(head));
    }

    @Test
    void test2() {
        int[] nodes = {1, 2};
        ListNode head = ListNodeGenerator.getListNode(nodes);
        int pos = 0;
        assertTrue(test.hasCycle(head));
    }

    @Test
    void test3() {
        int[] nodes = {1};
        ListNode head = ListNodeGenerator.getListNode(nodes);
        int pos = -1;
        assertFalse(test.hasCycle(head));
    }
}