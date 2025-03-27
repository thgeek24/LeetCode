/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m19;

import leetcode.ListNode;

/**
 * LeetCode 19
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/27 07:40
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int index = count - n;
        if (index == 0) {
            return head.next;
        }

        int currIndex = 0;
        curr = head;
        while (currIndex < index - 1) {
            currIndex++;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
