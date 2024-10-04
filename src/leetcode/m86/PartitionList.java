/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m86;

import leetcode.ListNode;

/**
 * LeetCode 86
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/04 09:29
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prevFast = null;
        ListNode prevSlow = null;
        while (fast != null) {
            if (fast.val < x) {
                while (slow.val < x && slow != fast) {
                    prevSlow = slow;
                    slow = slow.next;
                }
                if (prevFast == null) {
                    prevFast = fast;
                    fast = fast.next;
                    continue;
                }
                prevFast.next = fast.next;
                if (prevSlow == null) {
                    dummy.next = fast;
                } else {
                    prevSlow.next = fast;
                }
                fast.next = slow;
                prevSlow = fast;
                fast = prevFast.next;
            }
            if (fast != null) {
                prevFast = fast;
                fast = fast.next;
            }
        }
        return dummy.next;
    }
}
