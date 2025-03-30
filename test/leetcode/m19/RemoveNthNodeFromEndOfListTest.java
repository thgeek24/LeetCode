/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m19;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RemoveNthNodeFromEndOfList}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/27 07:41
 */
class RemoveNthNodeFromEndOfListTest {
    private RemoveNthNodeFromEndOfList test;

    @BeforeEach
    void setUp() {
        test = new RemoveNthNodeFromEndOfList();
    }

    @Test
    void test1() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2, 3, 4, 5});
        int n = 2;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 2, 3, 5});
        ListNode actual = test.removeNthFromEnd(head, n);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1});
        int n = 1;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{});
        ListNode actual = test.removeNthFromEnd(head, n);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2});
        int n = 1;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1});
        ListNode actual = test.removeNthFromEnd(head, n);
        assertEquals(expected, actual);
    }
}