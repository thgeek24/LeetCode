/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m61;

import leetcode.ListNode;

/**
 * LeetCode 61
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/03 08:15
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int len = 0;
        ListNode fast = head;
        ListNode oldTail = null;
        while (fast != null) {
            len++;
            oldTail = fast;
            fast = fast.next;
        }
        if (k % len == 0) {
            return head;
        }
        int newHeadStart = len - k % len;

        oldTail.next = head;
        ListNode newHead = head;
        ListNode newTail;
        int i = 0;
        do {
            newTail = newHead;
            newHead = newHead.next;
            i++;
        } while (i < newHeadStart);
        newTail.next = null;

        return newHead;
    }
}
