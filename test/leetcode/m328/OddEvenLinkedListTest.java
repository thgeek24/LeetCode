/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m328;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeComparator;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link OddEvenLinkedList}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 16:15
 */
class OddEvenLinkedListTest {
    private OddEvenLinkedList test;

    @BeforeEach
    void setUp() {
        test = new OddEvenLinkedList();
    }

    @Test
    void test1() {
        int[] sourceNums = {1, 2, 3, 4, 5};
        int[] expectedNums = {1, 3, 5, 2, 4};
        ListNode head = ListNodeGenerator.getListNode(sourceNums);
        ListNode expected = ListNodeGenerator.getListNode(expectedNums);
        assertTrue(ListNodeComparator.equals(expected, test.oddEvenList(head)));
    }

    @Test
    void test2() {
        int[] sourceNums = {2, 1, 3, 5, 6, 4, 7};
        int[] expectedNums = {2, 3, 6, 7, 1, 5, 4};
        ListNode head = ListNodeGenerator.getListNode(sourceNums);
        ListNode expected = ListNodeGenerator.getListNode(expectedNums);
        assertTrue(ListNodeComparator.equals(expected, test.oddEvenList(head)));
    }
}