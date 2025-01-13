/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package interview;

import interview.cmbcloud.PerfectLinkedList;
import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeComparator;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/13 14:29
 */
class PerfectLinkedListTest {
    private PerfectLinkedList test;

    @BeforeEach
    void setUp() {
        test = new PerfectLinkedList();
    }

    @Test
    void test1() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2, 2, 3, 1});
        ListNode expected = ListNodeGenerator.getListNode(new int[]{1, 1});
        ListNode actual = test.perfectLinkList(head);
        assertTrue(ListNodeComparator.equals(expected, actual));
    }

    ;

}