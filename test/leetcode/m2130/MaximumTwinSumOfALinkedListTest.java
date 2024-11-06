/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2130;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaximumTwinSumOfALinkedList}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 17:34
 */
class MaximumTwinSumOfALinkedListTest {
    private MaximumTwinSumOfALinkedList test;

    @BeforeEach
    void setUp() {
        test = new MaximumTwinSumOfALinkedList();
    }

    @Test
    void equalsSix() {
        int[] sourceNums = {5, 4, 2, 1};
        ListNode head = ListNodeGenerator.getListNode(sourceNums);
        int expected = 6;
        assertEquals(expected, test.pairSum(head));
    }

    @Test
    void equalsSeven() {
        int[] sourceNums = {4, 2, 2, 3};
        ListNode head = ListNodeGenerator.getListNode(sourceNums);
        int expected = 7;
        assertEquals(expected, test.pairSum(head));
    }

    @Test
    void equals10001() {
        int[] sourceNums = {1, 100000};
        ListNode head = ListNodeGenerator.getListNode(sourceNums);
        int expected = 100001;
        assertEquals(expected, test.pairSum(head));
    }
}