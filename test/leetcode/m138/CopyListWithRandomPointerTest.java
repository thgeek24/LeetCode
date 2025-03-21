/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m138;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/21 11:04
 */
class CopyListWithRandomPointerTest {
    private CopyListWithRandomPointer test;

    @BeforeEach
    void setUp() {
        test = new CopyListWithRandomPointer();
    }

    @Test
    void test1() {
        CopyListWithRandomPointer.Node first = new CopyListWithRandomPointer.Node(7);
        CopyListWithRandomPointer.Node second = new CopyListWithRandomPointer.Node(13);
        CopyListWithRandomPointer.Node third = new CopyListWithRandomPointer.Node(11);
        CopyListWithRandomPointer.Node fourth = new CopyListWithRandomPointer.Node(10);
        CopyListWithRandomPointer.Node fifth = new CopyListWithRandomPointer.Node(1);
        first.next = second;
        second.next = third;
        second.random = first;
        third.next = fourth;
        third.random = fifth;
        fourth.next = fifth;
        fourth.random = third;
        fifth.random = first;

        CopyListWithRandomPointer.Node head = first;
        CopyListWithRandomPointer.Node actual = test.copyRandomList(head);
        while (head != null && actual != null) {
            assertEquals(head.val, actual.val);
            assertEquals(head.random == null, actual.random == null);
            if (head.random != null) {
                assertEquals(head.random.val, actual.random.val);
            }
            head = head.next;
            actual = actual.next;
        }
    }
}