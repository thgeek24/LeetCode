/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2095;

import leetcode.ListNode;

/**
 * LeetCode 2095
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 15:51
 */
public class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        int len = 0;
        final ListNode _head = head;
        while (head != null) {
            len++;
            head = head.next;
        }
        if (len == 1) {
            return null;
        }

        int dist = len / 2;
        ListNode prev = null;
        ListNode curr = _head;
        while (dist > 0) {
            prev = curr;
            curr = curr.next;
            dist--;
        }
        prev.next = curr.next;
        curr.next = null;

        return _head;
    }
}
