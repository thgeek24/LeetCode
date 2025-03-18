/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m2;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeComparator;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link AddTwoNumbers}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/18 08:34
 */
class AddTwoNumbersTest {
    private AddTwoNumbers test;

    @BeforeEach
    void setUp() {
        test = new AddTwoNumbers();
    }

    @Test
    void test1() {
        ListNode l1 = ListNodeGenerator.getListNode(new int[]{2, 4, 3});
        ListNode l2 = ListNodeGenerator.getListNode(new int[]{5, 6, 4});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{7, 0, 8});
        ListNode actual = test.addTwoNumbers(l1, l2);
        assertTrue(ListNodeComparator.equals(expected, actual));
    }

    @Test
    void test2() {
        ListNode l1 = ListNodeGenerator.getListNode(new int[]{0});
        ListNode l2 = ListNodeGenerator.getListNode(new int[]{0});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{0});
        ListNode actual = test.addTwoNumbers(l1, l2);
        assertTrue(ListNodeComparator.equals(expected, actual));
    }

    @Test
    void test3() {
        ListNode l1 = ListNodeGenerator.getListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = ListNodeGenerator.getListNode(new int[]{9, 9, 9, 9});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1});
        ListNode actual = test.addTwoNumbers(l1, l2);
        assertTrue(ListNodeComparator.equals(expected, actual));
    }
}