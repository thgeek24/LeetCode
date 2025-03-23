/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e21;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MergeTwoSortedLists}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/20 08:20
 */
class MergeTwoSortedListsTest {
    private MergeTwoSortedLists test;

    @BeforeEach
    void setUp() {
        test = new MergeTwoSortedLists();
    }

    @Test
    void test1() {
        ListNode list1 = ListNodeGenerator.getListNode(new int[]{1, 2, 4});
        ListNode list2 = ListNodeGenerator.getListNode(new int[]{1, 3, 4});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 1, 2, 3, 4, 4});
        ListNode actual = test.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        ListNode list1 = ListNodeGenerator.getListNode(new int[]{});
        ListNode list2 = ListNodeGenerator.getListNode(new int[]{});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{});
        ListNode actual = test.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        ListNode list1 = ListNodeGenerator.getListNode(new int[]{});
        ListNode list2 = ListNodeGenerator.getListNode(new int[]{0});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{0});
        ListNode actual = test.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }
}