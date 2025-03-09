/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m86;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link PartitionList}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/04 09:32
 */
class PartitionListTest {
    private PartitionList test;

    @BeforeEach
    void setUp() {
        test = new PartitionList();
    }

    @Test
    void test1() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 4, 3, 2, 5, 2});
        int x = 3;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 2, 2, 4, 3, 5});
        assertEquals(expected, test.partition(head, x));
    }

    @Test
    void test2() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{2, 1});
        int x = 2;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 2});
        assertEquals(expected, test.partition(head, x));
    }

    @Test
    void test3() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 4, 3, 0, 2, 5, 2});
        int x = 3;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 0, 2, 2, 4, 3, 5});
        assertEquals(expected, test.partition(head, x));
    }
}