/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.h25;

import leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListNodeGenerator;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link ReverseNodesInKGroup}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/24 07:41
 */
class ReverseNodesInKGroupTest {
    private List<ReverseNodesInKGroup> tests;

    @BeforeEach
    void setUp() {
        tests = Arrays.asList(
//                new ReverseNodesInKGroup.Solution1(),
//                new ReverseNodesInKGroup.Solution2());
                new ReverseNodesInKGroup.Solution3());
    }

    @Test
    void test1() {
        ListNode expected = ListNodeGenerator.getListNode(new int[]{2, 1, 4, 3, 5});
        tests.forEach(item -> {
            ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2, 3, 4, 5});
            ListNode actual = item.reverseKGroup(head, 2);
            assertEquals(expected, actual);
        });
    }

    @Test
    void test2() {
        ListNode expected = ListNodeGenerator.getListNode(new int[]{3, 2, 1, 4, 5});
        tests.forEach(item -> {
            ListNode head = ListNodeGenerator.getListNode(new int[]{1, 2, 3, 4, 5});
            ListNode actual = item.reverseKGroup(head, 3);
            assertEquals(expected, actual);
        });
    }
}