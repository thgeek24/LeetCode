/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2095;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeComparator;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link DeleteTheMiddleNodeOfALinkedList}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 15:53
 */
class DeleteTheMiddleNodeOfALinkedListTest {
    private DeleteTheMiddleNodeOfALinkedList test;

    @BeforeEach
    void setUp() {
        test = new DeleteTheMiddleNodeOfALinkedList();
    }

    @Test
    void test1() {
        int[] sourceNums = {1, 3, 4, 7, 1, 2, 6};
        int[] expectedNums = {1, 3, 4, 1, 2, 6};
        ListNode head = ListNodeGenerator.getListNode(sourceNums);
        ListNode expected = ListNodeGenerator.getListNode(expectedNums);
        assertTrue(ListNodeComparator.equals(expected, test.deleteMiddle(head)));
    }

    @Test
    void test2() {
        int[] sourceNums = {1, 2, 3, 4};
        int[] expectedNums = {1, 2, 4};
        ListNode head = ListNodeGenerator.getListNode(sourceNums);
        ListNode expected = ListNodeGenerator.getListNode(expectedNums);
        assertTrue(ListNodeComparator.equals(expected, test.deleteMiddle(head)));
    }

    @Test
    void test3() {
        int[] sourceNums = {2, 1};
        int[] expectedNums = {2};
        ListNode head = ListNodeGenerator.getListNode(sourceNums);
        ListNode expected = ListNodeGenerator.getListNode(expectedNums);
        assertTrue(ListNodeComparator.equals(expected, test.deleteMiddle(head)));
    }
}