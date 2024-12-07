/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e83;

import leetcode.ListNode;

/**
 * LeetCode 83
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/28 10:27
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
