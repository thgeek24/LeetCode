/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m61;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeGenerator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RotateList}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/03 08:25
 */
class RotateListTest {
    private RotateList test;

    @BeforeEach
    void setUp() {
        test = new RotateList();
    }

    @Test
    void test1() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2, 3, 4, 5});
        int k = 2;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{4, 5, 1, 2, 3});
        assertEquals(expected, test.rotateRight(head, k));
    }

    @Test
    void test2() {
        ListNode head = ListNodeGenerator.getListNode(new int[]{0, 1, 2});
        int k = 4;
        ListNode expected = ListNodeGenerator.getListNode(new int[]{2, 0, 1});
        assertEquals(expected, test.rotateRight(head, k));
    }
}