/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m92;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ReverseLinkedListII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/23 08:59
 */
class ReverseLinkedListIITest {
    private ReverseLinkedListII test;

    @BeforeEach
    void setUp() {
        test = new ReverseLinkedListII();
    }

    @Test
    void test1() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2, 3, 4, 5});
        int left = 2;
        int right = 4;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 4, 3, 2, 5});
        ListNode actual = test.reverseBetween(head, left, right);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{5});
        int left = 1;
        int right = 1;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{5});
        ListNode actual = test.reverseBetween(head, left, right);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2, 3, 4, 5});
        int left = 2;
        int right = 5;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 5, 4, 3, 2});
        ListNode actual = test.reverseBetween(head, left, right);
        assertEquals(expected, actual);
    }
}