/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e83;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeComparator;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RemoveDuplicatesFromSortedList}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/28 10:28
 */
class RemoveDuplicatesFromSortedListTest {
    private RemoveDuplicatesFromSortedList test;

    @BeforeEach
    void setUp() {
        test = new RemoveDuplicatesFromSortedList();
    }

    @Test
    void test1() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 1, 2});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 2});
        assertTrue(ListNodeComparator.equals(expected, test.deleteDuplicates(head)));
    }

    @Test
    void test2() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 1, 2, 3, 3});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 2, 3});
        assertTrue(ListNodeComparator.equals(expected, test.deleteDuplicates(head)));
    }
}