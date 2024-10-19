/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m82;

import leetcode.ListNode;

/**
 * LeetCode 82
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/02 08:44
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode res = null;
        ListNode pointer = null;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null) {
            if (slow.val != fast.val) {
                if (res == null) {
                    res = new ListNode(slow.val);
                    pointer = res;
                } else {
                    pointer.next = new ListNode(slow.val);
                    pointer = pointer.next;
                }
            } else {
                while (fast != null && fast.val == slow.val) {
                    fast = fast.next;
                }
                if (fast == null) {
                    return res;
                }
            }
            slow = fast;
            fast = fast.next;
        }

        if (pointer == null) {
            return new ListNode(slow.val);
        }
        pointer.next = new ListNode(slow.val);
        return res;
    }
}
