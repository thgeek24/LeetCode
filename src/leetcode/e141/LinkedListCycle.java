/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e141;

import leetcode.ListNode;

/**
 * LeetCode 141
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/16 08:21
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
