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
        ListNode before = new ListNode(0);  // Stores nodes less than x
        ListNode after = new ListNode(0);   // Stores nodes greater than or equal to x

        // Pointers for the two lists
        ListNode beforeHead = before;
        ListNode afterHead = after;

        // Traverse the original list
        while (head != null) {
            if (head.val < x) {
                before.next = head;   // Add to the "before" list
                before = before.next;
            } else {
                after.next = head;    // Add to the "after" list
                after = after.next;
            }
            head = head.next;
        }

        before.next = afterHead.next;  // Connect the two lists

        return beforeHead.next;  // Return the head of the modified list
    }
}
