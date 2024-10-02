/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m82;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link RemoveDuplicatesFromSortedListII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/02 08:53
 */
class RemoveDuplicatesFromSortedListIITest {
    private RemoveDuplicatesFromSortedListII test;

    @BeforeEach
    void setUp() {
        test = new RemoveDuplicatesFromSortedListII();
    }

    @Test
    void test1() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 2, 5});
        assertEquals(expected, test.deleteDuplicates(head));
    }

    @Test
    void test2() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 1, 1, 2, 3});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{2, 3});
        assertEquals(expected, test.deleteDuplicates(head));
    }

    @Test
    void test3() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 1});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{});
        assertEquals(expected, test.deleteDuplicates(head));
    }

    @Test
    void test4() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2, 2});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1});
        assertEquals(expected, test.deleteDuplicates(head));
    }

    @Test
    void test5() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1});
        assertEquals(expected, test.deleteDuplicates(head));
    }

    @Test
    void test6() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 2});
        assertEquals(expected, test.deleteDuplicates(head));
    }
}