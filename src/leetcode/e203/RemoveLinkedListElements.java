/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e203;

import leetcode.ListNode;

/**
 * LeetCode 203
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/14 15:38
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1, head);

        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
