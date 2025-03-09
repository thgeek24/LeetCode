/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m24;

import leetcode.ListNode;

/**
 * LeetCode 24
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/09 10:10
 */
public class SwapNodesInParis {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;
        return newHead;
    }
}
