/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m24;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeComparator;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link SwapNodesInParis}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/09 10:11
 */
class SwapNodesInParisTest {
    private SwapNodesInParis test;

    @BeforeEach
    void setUp() {
        test = new SwapNodesInParis();
    }

    @Test
    void test1() {
        int[] headArray = {1, 2, 3, 4};
        int[] expectedArray = {2, 1, 4, 3};
        ListNode head = ListNodeGenerator.getListNode(headArray);
        ListNode expected = ListNodeGenerator.getListNode(expectedArray);
        ListNode actual = test.swapPairs(head);
        assertTrue(ListNodeComparator.equals(expected, actual));
    }

    @Test
    void test2() {
        int[] headArray = {};
        int[] expectedArray = {};
        ListNode head = ListNodeGenerator.getListNode(headArray);
        ListNode expected = ListNodeGenerator.getListNode(expectedArray);
        ListNode actual = test.swapPairs(head);
        assertTrue(ListNodeComparator.equals(expected, actual));
    }

    @Test
    void test3() {
        int[] headArray = {1};
        int[] expectedArray = {1};
        ListNode head = ListNodeGenerator.getListNode(headArray);
        ListNode expected = ListNodeGenerator.getListNode(expectedArray);
        ListNode actual = test.swapPairs(head);
        assertTrue(ListNodeComparator.equals(expected, actual));
    }

    @Test
    void test4() {
        int[] headArray = {1, 2, 3};
        int[] expectedArray = {2, 1, 3};
        ListNode head = ListNodeGenerator.getListNode(headArray);
        ListNode expected = ListNodeGenerator.getListNode(expectedArray);
        ListNode actual = test.swapPairs(head);
        assertTrue(ListNodeComparator.equals(expected, actual));
    }
}